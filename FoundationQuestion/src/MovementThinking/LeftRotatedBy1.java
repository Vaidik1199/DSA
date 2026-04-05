package MovementThinking;

import java.util.Arrays;

public class LeftRotatedBy1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int old = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=old;
        System.out.println(Arrays.toString(arr));
    }
}
