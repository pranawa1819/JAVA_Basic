package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            // Writing to Hello.txt inside the FileHandling folder
            FileOutputStream fo = new FileOutputStream("src/FileHandling/Hello.txt");

            String i = "Hello";
            byte[] b = i.getBytes(); // Convert String to byte array

            fo.write(b); // Write the byte array to the file
            fo.close();

            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
