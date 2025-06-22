package Inheritance;

public class InheritanceTests {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.noOfTyres = 4;
        twoWheeler two = new twoWheeler();
        vehicle1.commute();
        System.out.println();
        two.commute();
    }
}