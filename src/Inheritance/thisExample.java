package Inheritance;
public class thisExample extends Vehicle{
    @Override
    void start() {
        super.start();
        System.out.println(this);
       // System.out.println(this.model+"Car is starting!!");
        //System.out.println(this.WheelCount+"Wheels car");
    }

    public static void main(String[] args) {
        thisExample t1 = new thisExample();
      //  t1.WheelCount=4;
       // t1.model="BMW";
        t1.start();
        //t1.Color="Red";
    }
}