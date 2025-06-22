package FileHandling;
import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "\\Desktop";
        File my_obj = new File(desktopPath + "\\File1.txt");

        if(my_obj.exists()){
            System.out.println("File name: "+my_obj.getName());
            System.out.println("Absolute path: "+my_obj.getAbsolutePath());
            System.out.println("Writeable: "+my_obj.canWrite());
            System.out.println("Readable: "+my_obj.canRead());
            System.out.println("File size in bute: "+my_obj.length());
        }
        else{
            System.out.println("File does not exits!");
        }
    }
}
