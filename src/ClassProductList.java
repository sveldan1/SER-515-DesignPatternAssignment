import java.util.*;
import java.io.*;
public class ClassProductList {

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ProductIterator productIterator;
	ArrayList<Product> productlist;

	public ArrayList<Product> getProductlist() {
		return productlist;
	}

	public void setProductlist(ArrayList<Product> productlist) {
		this.productlist = productlist;
	}

	public void accept(NodeVisitor visitor) {

	}
	public ClassProductList() throws IOException {
	productlist= new ArrayList<>();
	File productfile = new File("src/ProductInfo.txt");
	BufferedReader bbr = new BufferedReader(new FileReader(productfile));
	String pt;

		while((pt=bbr.readLine())!=null) {
		String[] Arr=pt.split(":");
		Product product=new Product(Arr[0],Arr[1]);
		productlist.add(product);

	}
	System.out.println(Arrays.deepToString(productlist.toArray()));
	}


}
