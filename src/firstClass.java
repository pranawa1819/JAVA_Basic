// Variable is used to store data. It behaves like a container that can be reused
// to hold different values (but the type must match if statically typed).
// Not all variables are of the same size; different data types require different amounts of memory.

// Primitive: Specifies the size and type of variable values. These are simple values
// that are not objects. They are stored directly in the stack memory.
// There are 8 primitive data types in Java:
// boolean, char, byte, short, int, long, float, and double.

// Non-Primitive (also called Reference types):
// These include Strings, Arrays, Classes, Interfaces, and Objects.
// Reference types store the memory address (in the stack) that points to the actual
// object or data (in the heap memory).
// So, non-primitive variables do not hold the value itself, but a reference to it
//Reference: memory address(stack) that points to the (heap).These refer to object, string, objects, arrary(reference)
public class firstClass {
    public static void main(String[] args) {
        // declaration of variable : data type variable = value;

          int number = 2;

          if(number > 5){
              System.out.println("Greater than 5");

          }
          else{
              System.out.println("Smaller than 5");
          }
    }
}
