package Interface;

import java.util.Scanner;

public class Triangle implements Shape {

    @Override
    public void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle: ");
        int base = scanner.nextInt();
        System.out.println("Enter the height of the Triangle: ");
        int height = scanner.nextInt();
        System.out.println("The area of the Triangle is:"+(1/2*base*height));
    }

    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.getArea();
    }

}
