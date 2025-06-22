package ExceptionHandle;
import java.util.Scanner;

public class userhandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner class is used to get user input,

        System.out.println("Please, Enter your age: ");
        int age = input.nextInt();
        try {
            if (age > 16) {
                System.out.println("You are eligible for voting!!!");
            }
            else{
                throw new IllegalArgumentException("Sorry, you are not eligible to vote.");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }

    }

}
