package question2;

public class CarDemo {
    public static void main(String[] args) {
        Vehicle v;
         v = new Car();
        v.acceleration();
        v.applyBreak();

        v = new SportsCar();
        v.acceleration();
        v.applyBreak();
    }
}
