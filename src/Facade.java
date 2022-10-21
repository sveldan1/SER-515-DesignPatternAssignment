import java.io.*;
import java.util.*;
import java.util.Iterator;
public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;
//The login function authenticates the based on username and password and creates the user object
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
	//The accept function is accepting the visit in the facade class
	void accept(NodeVisitor nodeVisitor){
		System.out.println("Reminder is accepted in facade");
		nodeVisitor.visitFacade(this);
	}
	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}
// remind function is used to visit both the facade and product class
	public void remind() {
		ReminderVisitor reminderVisitor=new ReminderVisitor();
		Product p =new Product();
		p.accept(reminderVisitor);
		Facade f =new Facade();
		f.accept(reminderVisitor);

	}
//CreateUser function is creating the buyer or seller object based on userInfoItem
	public void createUser(UserInfoItem userinfoitem) {
		thePerson=PersonFactory.createPerson(userinfoitem);

	}
//createPoductList method is creating the list of all the products using ClassProductList method
	public void createProductList() throws IOException {
		theProductList=new ClassProductList();

	}
//Based on UserProduct.txt file, the products are being attached to the user who has logged in.
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
	//productOperation is creating the productmenu for buyer or seller based on theie selected product
	public void productOperation() {
		Product selecteduserproduct=SelectProduct();
		ProductMenu pm = thePerson.CreateProductMenu(selecteduserproduct);
		pm.showMenu();
	}
	//The user is selecting a product when displayed a list of products present
	//Here Iterator pattern is also implemented while iterating through the product list to display the products for the user
	public Product SelectProduct() {
		System.out.println("Iterator pattern initiated");
		System.out.println("Select and enter product from the below list");
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



