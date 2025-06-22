public class Workings_of_Printf {
    public static void main(String[] args) {
        //printf() is a method used to format input
        //%[flags][width][.precision][specifier.character]
        String name = "Ben10";
        char firstName = 'B';
        int age = 21;
        double height = 6.2;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with a letter %c\n", firstName);
        System.out.printf("You are %d years old \n", age);
        System.out.printf("Your height is: %f\n", height);
        System.out.printf("Are you the employee of NCCS College? %b", isEmployed);
    }
}