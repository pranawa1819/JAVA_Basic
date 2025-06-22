package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileinDesktop {
    public static void main(String[] args) {
        try {
            String desktopPath = System.getProperty("user.home") + "\\Desktop";
            File my_obj = new File(desktopPath + "\\File1.txt");
            if (my_obj.createNewFile()) {
                System.out.println("File created: " + my_obj.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + my_obj.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
