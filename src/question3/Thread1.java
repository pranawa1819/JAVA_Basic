package question3;
import java.util.Scanner;
public class Thread1 extends Thread {
    Rectangle rectangle;

    public Thread1(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    public void run(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value for length:");
        int length = input.nextInt();
        System.out.println("Enter the value for breadth:");
        int breadth = input.nextInt();
        rectangle.setData(length,breadth);
        System.out.println("Length:"+length);
        System.out.println("Breadth:"+breadth);

        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Input thread interrupted.");
        }
    }
}
