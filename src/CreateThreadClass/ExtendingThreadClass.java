package CreateThreadClass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ThroughClassOne t1 = new ThroughClassOne();
        ThroughClassTwo t2 = new ThroughClassTwo();
        ThroughClassThree t3 = new ThroughClassThree();

        t1.start();
        t2.start();
        t3.start();
        // wait for all thread to finished

        try{
            t1.join(); // join will wait to finish the previous thread
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.currentTimeMillis(); // end time
        System.out.printf("\nTotal time taken by %s : %d milliseconds\n",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }

}
