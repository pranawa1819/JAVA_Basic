package question3;

public class ThreadDemo {
    public static void main(String[] args) {
        Rectangle r2 = new Rectangle();

        Thread1 t1 = new Thread1(r2);
        Thread2 t2 = new Thread2(r2);
        Thread3 t3 = new Thread3(r2);

      t1.start();
        // Wait for input to finish before area/perimeter calculations
        try {
            t1.join();  // Ensures input completes before proceeding
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
      t2.start();
      t3.start();
    }
}
