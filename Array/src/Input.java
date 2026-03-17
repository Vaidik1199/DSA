import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//
//        // array of primitives
//        int [] arr = new int[5];
//        arr[0] = 23;
//        arr[1]= 45;
//        arr[2]= 233;
//        arr[3]= 543;
//        arr[4]= 3;
//
//        System.out.println(arr[3]);
//
//        // input using for loops
//        // if we do not know the size of array (int i = 0; i < arr.length; i++)
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Put the values one by one for "+i+" It will be :  ");
//            arr[i] = in.nextInt();
//        }
//        // for printing the array
//        // this is the enhanced for loop
//        for (int j : arr) {
//            System.out.print(j + " ");  // here j represents element of the array
//        }
//
//        //System.out.println(arr[5]);  // index outof bound error
//
//        //This is the normal for loop
//        // for (int i = 0; i < arr.length; i++) {
//        //            System.out.print(arr[i]+" ");
//        //        }
//
//
//        // and there is another method
//        // which created the arrays to string and print it
//        System.out.println(Arrays.toString(arr));  // by using Arrays class and toString method




        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Vaidik";

        System.out.println(Arrays.toString(str));
    }
}