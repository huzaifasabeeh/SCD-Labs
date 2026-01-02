package bankadt;

import java.util.LinkedList;
import java.util.Queue;

public class BillPaymentService implements BankService {

    Queue<String> billQueue = new LinkedList<>();

    public BillPaymentService() {
        billQueue.add("Ali");
        billQueue.add("Ahmed");
        billQueue.add("Sara");
    }

    @Override
    public void executeService() {
        System.out.println("Processing Bill Payments:");
        while (!billQueue.isEmpty()) {
            System.out.println("Bill paid for: " + billQueue.remove());
        }
    }
}
