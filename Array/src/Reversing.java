import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        reverse(arr);
    }
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
