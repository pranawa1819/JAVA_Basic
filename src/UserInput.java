import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner class is used to get user input,

        System.out.println("Please, Enter your name: ");
        String name = input.nextLine();//to write a value
        System.out.println("Goodnight: "+name);
        System.out.println(name+", Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: "+age);
    }
}
