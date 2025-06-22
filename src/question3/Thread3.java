package question3;

public class Thread3 extends Thread{


    Rectangle rectangle;

    public Thread3(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    public void run(){

        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Area thread interrupted.");
        }


        int perimeter = rectangle.getPerimeter();
        System.out.println("Perimeter of rectange: "+perimeter);


        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Area thread interrupted after sleep.");
        }
    }
}

