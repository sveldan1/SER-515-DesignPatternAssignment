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
		System.out.println("Buyer");
	}
	if(type_of_user==1){
		thePerson=new Seller(userinfoitem);
		System.out.println("Seller");
	}
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
