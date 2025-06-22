package Encapsulation;

public class EncapsulationCall {
    public static void main(String[] args) {
        Encapsulation.person p1 = new Encapsulation.person();
        p1.setAge(12);
        System.out.println(p1.getAge());
        p1.setName("Panda");
        System.out.println();
    }
}