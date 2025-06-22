package FileHandling;
import java.io.FileReader;
import java.io.IOException;
public class FileReadExample {
    public static void main(String[] args) throws IOException{
        String fileName="src/FileHandling/pranawa.txt";
        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            }while(read != -1);

        }
        catch(IOException E){
            System.out.printf("Execption occured: %s\n",E.getMessage());
        }
    }
}
