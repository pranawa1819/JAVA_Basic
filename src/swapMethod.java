import java.util.Scanner;

public class swapMethod {
    public static void main(String[] args) {


        //create a program to swap a number
        System.out.println("Let's do swapping");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of B: ");
        int b = input.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("A= "+a);
        System.out.println("B = "+b);

        int temp =a;
        a = b;
        b= temp;

        System.out.println("After Swapping:");
        System.out.println("A= "+a);
        System.out.println("B = "+b);
    }
}
