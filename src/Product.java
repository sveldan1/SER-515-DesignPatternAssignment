public class Product {
	private String category;
	private String productName;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
//private Trading trading;

	@Override
	public String toString() {
		return "Product{" +
				"category='" + category + '\'' +
				", productName='" + productName + '\'' +
				'}';
	}

	//private ClassProductList classProductList;

	public Product(String Category,String ProductName){
		this.category=Category;
		this.productName=ProductName;
	}

}
