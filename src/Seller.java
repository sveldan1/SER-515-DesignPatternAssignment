public class Seller extends Person {
	//private UserInfoItem userInfoItem;
	private Buyer buyer;

	public Seller(UserInfoItem userinfoitem) {
		this.userInfoItem=userinfoitem;
	}

	public void showMenu() {

	}

	@Override
	public void showComBoxes() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
