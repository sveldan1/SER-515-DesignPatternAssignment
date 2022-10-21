import java.util.*;
public abstract class Person implements ProductMenu {

	private ProductMenu theProductMenu;

	private Buyer buyer;

	private ProductMenu productMenu;
	 ArrayList<Product> userproducts;
	 UserInfoItem userInfoItem;

	public UserInfoItem getUserInfoItem() {
		return userInfoItem;
	}

	public void setUserInfoItem(UserInfoItem userInfoItem) {
		this.userInfoItem = userInfoItem;
	}

	public ArrayList<Product> getUserproducts() {
		return userproducts;
	}

	public void setUserproducts(ArrayList<Product> userproducts) {
		this.userproducts = userproducts;
	}

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public ProductMenu CreateProductMenu(Product p) {
		return null;
	}

}
