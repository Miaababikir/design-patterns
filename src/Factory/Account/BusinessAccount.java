package Factory.Account;

public class BusinessAccount implements Account {

    private String username;
    private String password;

    public BusinessAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void setupAccount() {
        System.out.println("Setup business account for " + this.username);
    }
}
