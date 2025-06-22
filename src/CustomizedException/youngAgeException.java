package CustomizedException;
import java.util.Scanner;
import java.util.Scanner;

public class youngAgeException extends RuntimeException{
    public youngAgeException(String message){
        super(message);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        try {
            if (age < 18) {
                throw new youngAgeException("You are not eligible for voting");

            } else {
                System.out.println("You can vote <3!");
            }
        }
        catch (youngAgeException e){
           e.printStackTrace();
        }
    }
}