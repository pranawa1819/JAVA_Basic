package ExceptionHandle;

public class normalCheck{
    public static void main(String[] args) {
        int[] numerator={10, 10, 18, 28};
        int[] denominator={1,0,3,4};

            for (int i = 0; i < numerator.length; i++) {
                try {
                    System.out.println(divide(numerator[i], denominator[i]));
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Good job!!");
    }
    public static int divide(int a, int b){
        return a/b;
    }
}