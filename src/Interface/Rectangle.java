package Interface;

import java.util.Scanner;

public class Rectangle implements Shape {

    @Override
    public void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.println("The area of the rectangle is: " + length * length);
    }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.getArea();
    }

}