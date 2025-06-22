package Interface;

public interface Animal {
    //Interface is the blue-print for class.
    //Interface have static and default method.
    //Static methods can only be accessible through interfaces.a
    public static final int max_age = 100;

    public abstract void eat();

    void sleep();

    public static void info() {
        System.out.println("My dog is of white color!");
    }

    //default is the concrete method. It will come in instance without any overriding
    default void run() {
        System.out.println("The animal is running!");
    }
}
