package MovementThinking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayByKstepsRightwards {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        int k = 3;

        for (int i = 0; i < k; i++) {
            Rotate(arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Rotate(int[] arr) {
        int old = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i]=arr[i-1];
        }

        arr[0] = old;
    }
}
