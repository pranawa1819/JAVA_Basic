package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {

            FileInputStream fi = new FileInputStream("src/FileHandling/Hello.txt");

            int i;
            while ((i = fi.read()) != -1) {
                System.out.print((char) i);  // Use print instead of println for better formatting
            }
            fi.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
