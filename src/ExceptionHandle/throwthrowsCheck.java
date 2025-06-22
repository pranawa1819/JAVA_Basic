package ExceptionHandle;

import java.util.Scanner;

public class throwthrowsCheck {
    public static double area(int r)  {
        if(r<0){
            throw new IllegalArgumentException("The area is negative");
        }
        return Math.PI*r*r;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args) {
        //int radius =5;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Please, Enter radius of a circle: ");
            int radius = input.nextInt();
            double result = area(radius);
            System.out.println("Area of a circle is : "+result);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());
        }
        try {
            System.out.println("Please, Enter numerator: ");
            int a = input.nextInt();
            System.out.println("Please, Enter Denominator: ");
            int b = input.nextInt();

            int c = divide(a,b);
        }
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
