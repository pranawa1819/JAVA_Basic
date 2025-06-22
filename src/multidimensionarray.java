// 2D array is an array where each element is an array. It is useful for

public class multidimensionarray {
    public static void main(String[] args) {
        int[][] myArr = new int[2][3];

        int[][] arr = {{1,2,3,},{4,5,6}};

        int i=0;
        System.out.println("The 2 dimension array is :");
        while(i < arr.length){
            int j =0;
            while(j < arr[i].length){
                System.out.printf(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
