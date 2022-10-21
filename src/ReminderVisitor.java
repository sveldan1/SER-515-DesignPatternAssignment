//ReminderVisitor here is used to vist product and facade classes
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public Reminder visitProduct(Product product) {
		System.out.println("Product is visited");
		return null;
	}

	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {
		System.out.println("Facade is visited");
	}

}
