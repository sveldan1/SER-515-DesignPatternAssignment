public class UserInfoItem {
    private int userType;
    private String username;
    private String password;
    public UserInfoItem(int userType, String username, String password){
        this.userType=userType;
        this.username=username;
        this.password=password;
    }
    public UserInfoItem(){

    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
