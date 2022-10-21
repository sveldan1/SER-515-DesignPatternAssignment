import java.io.IOException;

//Facade pattern is implemented using login and visitor pattern is also implemented here
public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        System.out.println("Facade pattern initiated");
        try {
            if(facade.login()){
                System.out.println("Welcome!");
                facade.createProductList();
                facade.AttachProductToUser();
                //Product product=facade.SelectProduct();
                facade.productOperation();
                System.out.println("Visitor Pattern is initiated");
                facade.remind();

            }
            else{
                System.out.println("Check again");
            }
        } catch (IOException e) {
            System.out.println("Unable to read");
        }

        //System.out.println("Hello world!");
    }
}