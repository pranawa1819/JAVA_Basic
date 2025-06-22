import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {

       /*
       Scanner input = new Scanner(System.in); // Scanner class is used to get user input,

        String items;
        double price;
        int quantity;
        double total;

        System.out.println("What would you like to buy?");
        items = input.nextLine();
        System.out.println("What is the price per item?");
        price = input.nextDouble();
        System.out.println("How many would you like to buy?");
        quantity = input.nextInt();

        total = price*quantity;

        System.out.println("Your total is : "+total);
        System.out.println("\n You have bought " + quantity+" "+items);
        */

        //printf() = is a method used to format output

        String name ="Panda";
        char firstletter ='P';
        int age = 22;
        double height= 5.6;
        boolean isEmployed = true;

        System.out.printf("Hello %s \n", name);
        System.out.printf("Your name starts with the letter %c \n", firstletter);
        System.out.printf("Your age is %d\n",age);
        System.out.printf("Your height is %.3f\n",height);
        System.out.printf("Are you the employee of NCCS College?: %b\n",isEmployed);

    }
}
