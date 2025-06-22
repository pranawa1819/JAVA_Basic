package CreateThreadClass;

public class ThroughClassThree extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=50; i++){
            System.out.printf("%d#",i);
        }
        System.out.println("\n # Task complete");
    }
}
