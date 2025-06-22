package CreateThreadClass;

public class MultiThread extends Thread {

    public MultiThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " - Priority: " + Thread.currentThread().getPriority() +
                    " - Count: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThread t1 = new MultiThread("Ram");
        MultiThread t2 = new MultiThread("Hari");
        MultiThread t3 = new MultiThread("Sita");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}