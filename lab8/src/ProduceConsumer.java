class Consumer {
    private int data;
    private boolean isProduced = false;

    public synchronized void produce(int value) {
        while (isProduced) {
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        System.out.println("Produced: " + value);
        isProduced = true;
        notifyAll();
    }

    public synchronized int consume() {
        while (!isProduced) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notifyAll();
        return data;
    }
}

class Producer extends Thread {
    private Consumer buffer;

    public Producer(Consumer b) { buffer = b; }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try { Thread.sleep(400); } catch (InterruptedException e) {}
        }
    }
}

class ConsumerWorker extends Thread {
    private Consumer buffer;

    public ConsumerWorker(Consumer b) { buffer = b; }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try { Thread.sleep(600); } catch (InterruptedException e) {}
        }
    }
}

public class ProduceConsumer {
    public static void main(String[] args) {
        Consumer buffer = new Consumer();

        Producer producer = new Producer(buffer);
        ConsumerWorker consumer = new ConsumerWorker(buffer);

        producer.start();
        consumer.start();
    }
}
