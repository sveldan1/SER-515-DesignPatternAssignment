//PersonFactory extends the Person class and is used in factory method to create the person object which is either
//buyer or seller based on the user input
public abstract class PersonFactory extends Person{
    public static Person createPerson(UserInfoItem userInfoItem){
        System.out.println("Factory pattern initiated for person creation");
        int type_of_user=userInfoItem.getUserType();
        if(type_of_user==0){
            System.out.println("Buyer created");
            return new Buyer(userInfoItem);

        }
        else{
            System.out.println("Seller created");
            return new Seller(userInfoItem);

        }
    }
}
