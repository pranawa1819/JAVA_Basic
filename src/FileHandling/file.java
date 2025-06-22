package FileHandling;
import java.io.IOException;
import java.io.FileWriter;

public class file {
    public static void main(String[] args) {
       String fileName ="src/FileHandling/example.txt";// Define the filename
        //FileWriter writer = null;

        try{
            //writer = new FileWriter(fileName);
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is the best example for file to write.");
            writer.flush();
            System.out.println("All the data were written successfully");

        }
        catch(IOException e){
            System.out.printf("Exception offer %s\n",e.getMessage());
        }
        //finally{
         //   if(writer != null) {
           //     writer.close();
           // }
       // }

    }
}