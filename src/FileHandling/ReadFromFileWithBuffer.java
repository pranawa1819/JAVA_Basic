package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileWithBuffer {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "\\Desktop";
        String filepath =desktopPath + "\\File1.txt";
        try{
            BufferedReader reader= new BufferedReader(new FileReader(filepath));
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("An error occured while reading file.");
            e.printStackTrace();
        }
    }
}
