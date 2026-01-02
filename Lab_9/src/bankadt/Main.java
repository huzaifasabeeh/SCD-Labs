package bankadt;

public class Main {

    public static void main(String[] args) {

        BankService billService = new BillPaymentService();
        BankService accountService = new AccountOpeningService();
        BankService loanService = new LoanContactService();

        billService.executeService();
        System.out.println();

        accountService.executeService();
        System.out.println();

        loanService.executeService();
    }
}
