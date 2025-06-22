// array is a similar type of element that have contiguous memory location. Java array is an object that contains element of similar data type.
// array is the collection of values of the same datatypes.
//*think of it as a variable that can store
// string[] array = new string[100];
// datatype[][] arr;
public class Array {

    public static void main(String[] args){
        int[] a = {20,21,22,23,24,25};
       int i =0;

        System.out.println("The list of an array is :" );
        /*
        for (i=0;i<4;i++){
           System.out.println(a[i] );

        }
        System.out.println("The number at index 2 is : "+a[2]);
       */
        while(i<5){
            System.out.println(a[i]);
            i++;
        }
    }

}

