import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        try {
            if(facade.login()){
            System.out.println("Welcome!");
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