package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
       try{
           String desktopPath = System.getProperty("user.home")+"\\Desktop";
           File file = new File(desktopPath+"\\File1.txt");
           FileWriter writer = new FileWriter(file);
           writer.write("We are learing file handling in java.");
           writer.close();
           System.out.println("Successfully wrote inside the file");
       }
       catch (IOException e){
           System.out.println("Error occurred");
           e.printStackTrace();
       }
    }
}
