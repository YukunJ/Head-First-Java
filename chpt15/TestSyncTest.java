public class TestSyncTest {

    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a  = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
}

class TestSync implements Runnable {
    private int balance = 0;

    public synchronized void increment() {
        int i = balance;
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        balance = i + 1;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            increment();
            System.out.println("Balance is now " + balance);
        }
    }
}