package question2;

public class Car implements Vehicle{
    private final int speedValue = 5;
    protected int speed = 0;
    @Override
    public void acceleration() {
        speed += speedValue;
        System.out.println("Acclerating by: "+speed);
    }

    @Override
    public void applyBreak() {
        speed -= speedValue;
        System.out.println("Slowing down by: "+speed);
    }
}
