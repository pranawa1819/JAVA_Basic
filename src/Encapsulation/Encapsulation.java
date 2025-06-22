package Encapsulation;

public class Encapsulation {
    //Encapsulation is one of the concepts in Java OOP. It is the process of wrapping data (variables) and methods that
    //operate on the data into a single unit, i.e a class.
    public static class person {
        private int age;
        private String name;

        boolean canBechanged = true;
        //boolean canBechanged = false; //if we do this then value will be by default
        //age unaccessible

        public void setAge(int age) {
            if (canBechanged) {
                if (age > 0) {
                    this.age = age;
                }
            }

        }

        public void setName(String name) {
            this.name = name;
        }

        boolean canBeAccessed = true;

        public int getAge() {
            if (canBeAccessed)
                return age;
            return -1;
        }

    }
}