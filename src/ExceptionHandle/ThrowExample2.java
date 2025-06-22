package ExceptionHandle;

public class ThrowExample2 {
    public static void main(String[] args) {
        ThrowExample2 t = new ThrowExample2();
        t.divide();
    }
    void divide(){
        int a=100, b=0, c;
        c=a/b;//now main method creates exception object that includes exceptions class, description,
        System.out.println(c);

    }
}
