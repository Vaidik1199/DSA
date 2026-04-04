package loopsArrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {23, 45,55, 76, 45};
//        ReverseArray(arr);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // i neglect that one normal level approach as that approach wants another array, takes more space;
    public static void ReverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++){
            // swap arr[i] with arr[n-1-i]
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }




    // diff approach
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
