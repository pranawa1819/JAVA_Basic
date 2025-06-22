package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {

        public static void main(String[] args) throws IOException{
            String fileName ="src/FileHandling/pranawa.txt";// Define the filename
            //FileWriter writer = null;

            try(FileWriter writer = new FileWriter(fileName)){ // try with resources it indicates that the file will be closed automatically after opening it
                //writer = new FileWriter(fileName);
                writer.write("This is the best example for file to write.");
                for(int i =0; i<3;i++) {
                    writer.write("\n*");
                }
                writer.flush();
                System.out.println("All the data were written successfully");
                writer.close();
            }
            catch(IOException e){
                System.out.printf("Exception offer %s\n",e.getMessage());
            }


        }

}
