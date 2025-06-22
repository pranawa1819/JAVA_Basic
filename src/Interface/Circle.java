package Interface;

import java.util.Scanner;

public class Circle implements Shape {
    @Override
    public void getArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        System.out.println("The area of the circle is: " + Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Circle C1 = new Circle();
        C1.getArea();
    }
}