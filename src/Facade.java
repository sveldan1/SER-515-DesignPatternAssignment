import java.io.*;
import java.util.*;
import java.util.Iterator;
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
		thePerson=PersonFactory.createPerson(userinfoitem);

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
		//System.out.println(name);

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
			//System.out.println(Arrays.toString(thePerson.userproducts.toArray()));

	}
	public void productOperation() {
		Product selecteduserproduct=SelectProduct();
		ProductMenu pm = thePerson.CreateProductMenu(selecteduserproduct);
		pm.showMenu();
	}
	public Product SelectProduct() {
		System.out.println("Iterator pattern initiated");
		System.out.println("Select product from the below");
//		for (Product p : theProductList.getProductlist()) {
//			System.out.println(p.getProductName());
//			//System.out.println(Arrays.deepToString(theProductList.getProductlist().toArray()));
//		}
		ProductIterator productIterator1=new ProductIterator(theProductList.getProductlist());
		while(productIterator1.hasNext()){
			Product nextP1=productIterator1.Next();
			System.out.println(nextP1.getProductName());
		}
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		String inputProductname = scanner.nextLine();
		Product xp=null;
		ArrayList<String> listofproducts=new ArrayList<>();
//		System.out.println("Iterator pattern initiated");
//		ArrayList<String> listofproducts1=new ArrayList<>();
//		ProductIterator productIterator=new ProductIterator(theProductList.getProductlist());
//		while(productIterator.hasNext()){
//			Product nextP=productIterator.Next();
//			listofproducts1.add(nextP.getProductName());
//		}
//		System.out.println(listofproducts1);
		for (Product inputProduct:theProductList.getProductlist())
			//System.out.println(inputProduct);
		{listofproducts.add(inputProduct.getProductName());}
		//System.out.println(listofproducts);
		for(Product p: theProductList.getProductlist()){
			String productname=p.getProductName();
			if(productname.equalsIgnoreCase(inputProductname)){
				xp=p;
				break;
			}
		}

		return xp;
}

	}



