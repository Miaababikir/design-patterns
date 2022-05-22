package Factory;

import Factory.Account.Account;
import Factory.Account.BusinessAccount;
import Factory.Account.FamilyAccount;
import Factory.Account.PersonalAccount;

public class AccountFactory {

    public Account createAccount(String username, String password, String type) {
        if (type.equals("PERSONAL")) {
            return new PersonalAccount(username, password);
        }

        if (type.equals("FAMILY")) {
            return new FamilyAccount(username, password);
        }

        return new BusinessAccount(username, password);
    }

}
