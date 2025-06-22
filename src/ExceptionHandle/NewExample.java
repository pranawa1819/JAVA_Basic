package ExceptionHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewExample {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/ExceptionHandle/abc.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println(" Sorry!!\n File is not found.");
        }
        finally {
            if (fis != null) {
                try {
                    fis.close(); // may throw IOException
                    System.out.println("File Closed");
                } catch (IOException e) {
                    System.out.println("Error while closing the file: " + e.getMessage());
                }
            }
            else {
                System.out.println(" There is not any file to close");
            }
        }
    }
}
