class CalculationThreadWorker extends Thread {
    @Override
    public void run() {
        System.out.println("CalculationThread Started...");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Calculating: " + (i * 2));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("CalculationThread Finished!");
    }
}

class LoggingThread extends Thread {
    @Override
    public void run() {
        System.out.println("LoggingThread Started...");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Logging data entry: " + i);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LoggingThread Finished!");
    }
}

public class CalculationThread {
    public static void main(String[] args) {

        CalculationThreadWorker t1 = new CalculationThreadWorker();
        LoggingThread t2 = new LoggingThread();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
