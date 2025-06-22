package Inheritance;

public class Car extends Vehicle{
String Color;

    @Override
    void start() {
        super.start();
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.noOfTyres=4;
        //c1.model ="BMW";
        c1.start();
        c1.Color="Red";

    }
}