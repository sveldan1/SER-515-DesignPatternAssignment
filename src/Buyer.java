public class Buyer extends Person {
	//UserInfoItem userInfoItem;
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
	//Bridge pattern is implemented here, based on selected product by the user, either meatproductmenu
	// or produceproductmenu  is created for the buyer
	public ProductMenu CreateProductMenu(Product p) {
		System.out.println("Bridge pattern initiated");
		MeatProductMenu meatProductMenu=new MeatProductMenu();
		ProduceProductMenu produceProductMenu=new ProduceProductMenu();
		//System.out.println("Buyer Product menu");
		String productcategory= p.getCategory();
			//System.out.println(productcategory);
		if(productcategory.equalsIgnoreCase("Meat")){
			return(meatProductMenu);
		}
		else{
			return(produceProductMenu);
		}
	}

}
