package ExceptionHandle;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;//now main method creates exception object that includes exceptions class, description,
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("WellDone!!");
    }
}
