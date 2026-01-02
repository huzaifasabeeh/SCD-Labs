package bankadt;

import java.util.Stack;

public class LoanContactService implements BankService {

    Stack<String> loanDefaulters = new Stack<>();

    public LoanContactService() {
        loanDefaulters.push("Usman");
        loanDefaulters.push("Bilal");
        loanDefaulters.push("Hassan");
    }

    @Override
    public void executeService() {
        System.out.println("Contacting Loan Defaulters:");
        while (!loanDefaulters.isEmpty()) {
            System.out.println("Contacted: " + loanDefaulters.pop());
        }
    }
}
