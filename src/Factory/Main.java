package Factory;

import Factory.Account.Account;
import Factory.Account.PersonalAccount;

public class Main {

    public static void main(String[] args) {
        Registration registration = new Registration();

        Account account = registration.register("omer", "123456", "FAMILY");

        account.setupAccount();
    }

}
