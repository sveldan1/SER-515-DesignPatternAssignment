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
	//Bridge pattern is implemented here, based on selected product by the user, either meatproductmenu
	// or produceproductmenu  is created for the seller
	public ProductMenu CreateProductMenu(Product p) {
		System.out.println("Bridge pattern initiated");
		String productcategory= p.getCategory();
		if(productcategory.equals("Meat")){
			return(new MeatProductMenu());
		}
		else{
			return(new ProduceProductMenu());
		}
	}

}
