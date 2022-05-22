package Factory.Account;

public class FamilyAccount implements Account {

    private String username;
    private String password;

    public FamilyAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void setupAccount() {
        System.out.println("Setup family account for " + this.username);
    }
}
