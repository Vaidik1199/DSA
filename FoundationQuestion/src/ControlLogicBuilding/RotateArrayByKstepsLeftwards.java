package ControlLogicBuilding;

import java.util.Arrays;

public class RotateArrayByKstepsLeftwards {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 2;
        for (int i = 0; i < k; i++) {
            int temp = arr[i];
            Rotation(arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void Rotation(int[] arr) {
        int old = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=old;
    }
}
