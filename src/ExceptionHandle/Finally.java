package ExceptionHandle;

public class Finally {
    public static void main(String[] args) {
        try{ //  we always write risky code
            int a= 100, b=0, c;
            c= a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){  // handling error
            System.out.println(e);
        }
        finally{  // this block will always run, even if an exception occurs.
            System.out.println("I am inside finally block");

        }
    }
}
