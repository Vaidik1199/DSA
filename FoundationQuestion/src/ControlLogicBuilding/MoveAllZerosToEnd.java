package ControlLogicBuilding;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,45,0,67,4,5,0,8};
        ShiftZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ShiftZeros(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
