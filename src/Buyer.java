public class Buyer extends Person {
	private UserInfoItem userInfoItem;
	private Seller seller;

	private Person person;

	public Buyer(UserInfoItem userinfoitem) {
		this.userInfoItem=userinfoitem;
	}

	public void showMenu() {

	}

	@Override
	public void showComBoxes() {

	}

	/**
	 *  
	 */
	public ProductMenu CreateProductMenu() {
		return null;
	}

}
