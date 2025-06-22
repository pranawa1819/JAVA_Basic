package Enumeration;

public class enumDemo{
    public static void main(String[] args) {
        //System.out.println(Day.Sunday);

        Days monday = Days.Monday;
        int  ordinal = monday.ordinal(); // it shows the location of the array
        System.out.println(ordinal);

        System.out.println(monday.name().toUpperCase());
    }
}