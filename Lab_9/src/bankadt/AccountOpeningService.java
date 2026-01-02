package bankadt;

import java.util.ArrayList;
import java.util.List;

public class AccountOpeningService implements BankService {

    List<String> accounts = new ArrayList<>();

    public AccountOpeningService() {
        accounts.add("Account-1001");
        accounts.add("Account-1002");
    }

    @Override
    public void executeService() {
        System.out.println("Opening New Accounts:");
        for (String acc : accounts) {
            System.out.println("Opened: " + acc);
        }
    }
}
