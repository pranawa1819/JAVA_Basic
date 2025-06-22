package question2;

public class SportsCar implements Vehicle{
    private int speedValue = 10;
    private int speed = 0;



    @Override
    public void acceleration() {
        speed += speedValue;
        System.out.println("acceleration of sports car is: "+speed);
    }

    @Override
    public void applyBreak() {
        speed -= speedValue;
        System.out.println("Sports car slow down the speed by: "+speed);

    }
}
