import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;
        rows = 3;
        columns = 3;
        System.out.println("Enter the symbols to use:");
        symbol = scanner.next().charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(symbol + " ");
            }
            System.out.println();
        }
    }
}
