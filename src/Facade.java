import java.io.*;
import java.util.*;
public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() throws IOException {
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
				System.out.println("user is a buyer");
				return true;
			}
			else{
				System.out.println("Password does not match");
				return false;
			}
		}
		else if(sellermap.containsKey(username)){
			if((sellermap.get(username)).equals(password)){
				System.out.println("user is a seller");
				return true;
			}
			else{
				System.out.println("password does not match");
				return false;
			}
		}
		else{
			return false;
		}

//		for (String user: buyermap.keySet()){
//			if(username.equals(user) && password.equals(buyermap.get(user))){
//			System.out.println("user is a buyer");
//			break;
//			}
//			else if(username.equals(user) && !password.equals(buyermap.get(user))){
//				System.out.println("password does not match");
//			}
//			else{
//				System.out.println("user is not a buyer");
//			}
//		}
//		for (String user: sellermap.keySet()){
//			if(username.equals(user) && password.equals(sellermap.get(user))){
//				System.out.println("user is a seller");
//				break;
//			} else if (username.equals(user)&& !password.equals(sellermap.get(user))) {
//				System.out.println("password does not match");
//			} else{
//				System.out.println("user is not a seller");
//			}
//		}





			//System.out.println(St);


		//return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
