package FileHandling;
import java.io.IOException;
import java.io.File;
public class CreateFile {
    public static void main(String[] args) {

        try{
            File my_obj = new File ("src/FileHandling/file1.txt");
            if (my_obj.createNewFile()){
                System.out.println("File created: "+ my_obj.getName());
            }
            else{
                System.out.println("File already exist.");
            }

        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

