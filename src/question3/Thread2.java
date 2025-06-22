package question3;

public class Thread2 extends Thread{
    Rectangle rectangle;

    public Thread2(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    public void run(){

        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Area thread interrupted.");
        }


        int area = rectangle.getArea();
        System.out.println("Area of rectange :"+ area);

        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Area thread interrupted after sleep.");
        }
    }


}
