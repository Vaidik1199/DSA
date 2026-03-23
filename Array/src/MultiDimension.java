import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
               1  2  3
               4  5  6
               7  8  9
         */

        // adding the rows is mandatory but columns are optional
        int[][] arr = new int[3][3];

        // another type
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // myth clear the array is not a matrix
        int [][] arr2D = {
                {1,2,3},  //0th index
                {4,5},    //1st index
                {6,7,8,9} //2nd index
        };

        System.out.println(Arrays.toString(arr2D[2]));  // [6,7,8,9]
        System.out.println(arr2D[2][0]);   //6


        // for input in the array
        int[][] arr3 = new int[3][2];
        System.out.println(arr.length);// it will print 3 only not 2 means only row

        // taking input
        for (int row = 0; row < arr3.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] =in.nextInt();
            }
        }

        // giving output
        for (int row = 0; row < arr3.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col]+ "    ");
            }
            System.out.println();
        }

        // another method to print,,,
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr3[row]));
        }
    }
}
