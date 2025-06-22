package Interface;

public class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("The dog is sleeping!");
    }

    @Override
    public void eat() {
        System.out.println("The dog is sleeping!");
    }

    @Override
    public void run() {
        System.out.println("Hi!, My dog is running!");
    }
    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.eat();
        D1.sleep();
        Animal.info();
        D1.run();


    }
}

