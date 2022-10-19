import java.io.*;
import java.util.*;


public class Login {
    public UserInfoItem login() throws IOException{
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Reading input from console");
        System.out.println("Please enter username: ");
        String username = scanner.nextLine();
        System.out.println("Please enter password: ");
        String password = scanner.nextLine();

        File buyerfile = new File("src/BuyerInfo.txt");
        BufferedReader bbr = new BufferedReader(new FileReader(buyerfile));

        String bt;
        final Map<String, String> buyermap = new HashMap<>();
        while((bt=bbr.readLine())!=null) {
            String[] Arr=bt.split(":");
            buyermap.put(Arr[0], Arr[1]);

        }
        //System.out.println(buyermap);

        File sellerfile=new File("src/SellerInfo.txt");
        BufferedReader sbr = new BufferedReader(new FileReader(sellerfile));

        String st;
        final Map<String, String> sellermap = new HashMap<>();
        while((st=sbr.readLine())!=null) {
            String[] krr=st.split(":");
            sellermap.put(krr[0], krr[1]);

        }
        //System.out.println(sellermap);

        if(buyermap.containsKey(username)){
            if((buyermap.get(username)).equals(password)){
                UserInfoItem userInfoItem=new UserInfoItem(0,username,password);

                return userInfoItem;

            }
            else{
                System.out.println("Password does not match for buyer");
                return login();
            }
        }
        else if(sellermap.containsKey(username)){
            if((sellermap.get(username)).equals(password)){
                UserInfoItem userInfoItem=new UserInfoItem(1,username,password);

                return userInfoItem;
                //System.out.println("user is a seller");
                //return true;
            }
            else{
                System.out.println("password does not match for seller");
                return login();
            }
        }
        else{
            System.out.println("username does not match with buyer or seller");
            return login();


    }
}
}
