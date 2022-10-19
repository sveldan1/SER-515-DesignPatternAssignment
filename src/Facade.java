import java.io.*;
import java.util.*;
public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() throws IOException {
		Login l = new Login();
		UserInfoItem userInfoItem=l.login();
		UserType=userInfoItem.getUserType();
		createUser(userInfoItem);
		return true;
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
	int type_of_user=userinfoitem.getUserType();
	if(type_of_user==0){
		thePerson=new Buyer(userinfoitem);
		System.out.println("Buyer created");
	}
	if(type_of_user==1){
		thePerson=new Seller(userinfoitem);
		System.out.println("Seller created");
	}
	}

	public void createProductList() throws IOException {
		theProductList=new ClassProductList();

	}

	public void AttachProductToUser() throws IOException {
		ArrayList<String> userproductlist= new ArrayList<>();
		File userproductfile = new File("src/UserProduct.txt");
		BufferedReader bbr = new BufferedReader(new FileReader(userproductfile));
		String pt;
		String name=thePerson.getUserInfoItem().getUsername();
		System.out.println(name);

		while((pt=bbr.readLine())!=null) {
			String[] Arr=pt.split(":");
			if(Arr[0].equals(thePerson.getUserInfoItem().getUsername())){
				userproductlist.add(Arr[1]);

			}
		}
		ArrayList<Product> userProductObjects=new ArrayList<>();
			for(Product p: theProductList.getProductlist()){
				String productname=p.getProductName();
				if(userproductlist.contains(productname)){
					userProductObjects.add(p);
				}
			}

			thePerson.setUserproducts(userProductObjects);
			System.out.println(Arrays.toString(thePerson.userproducts.toArray()));

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
