public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println(add(5, 4));
        System.out.println(add(5, 4, 8));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
