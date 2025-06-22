import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times you want the loops to be repeated:");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println("I AM PANDA! I AM CRY BABY!");
        }
    }
}