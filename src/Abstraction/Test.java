package Abstraction;

public class Test {
    public static void main(String[] args) {
        DogAbstract dog = new DogAbstract();
        dog.sayHello();
        Cat cat1 = new Cat();
        cat1.sayHello();
    }
}
