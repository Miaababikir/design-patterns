package Factory.Account;

public class PersonalAccount implements Account {

    private String username;
    private String password;

    public PersonalAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void setupAccount() {
        System.out.println("Setup personal account for " + this.username);
    }
}
