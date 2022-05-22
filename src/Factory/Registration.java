package Factory;

import Factory.Account.Account;
import Factory.Account.BusinessAccount;
import Factory.Account.PersonalAccount;

public class Registration {

    // Make the change easy and then make the easy change
    public Account register(String username, String password, String type) {
        // validation
        // sending emails
        // checking the database

        return new AccountFactory().createAccount(username, password, type);
    }

}
