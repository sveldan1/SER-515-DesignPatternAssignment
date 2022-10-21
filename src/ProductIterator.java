import java.util.ArrayList;
import java.util.Iterator;


public class ProductIterator {

	private ClassProductList classProductList;

	public int idx;
	ArrayList<Product> productList;
	public ProductIterator(ArrayList<Product> productList) {
		this.productList = productList;
		this.idx=0;
	}

	public boolean hasNext() {
		if(this.idx<productList.toArray().length){
			return true;
		}
		return false;
	}

	public Product Next() {
		//this.idx=this.idx+1;
		return productList.get(this.idx++);
	}

	public void MoveToHead() {
		this.idx=0;
	}

	public void Remove() {
		productList.remove(this.idx);
		this.idx=this.idx-1;
	}

}
