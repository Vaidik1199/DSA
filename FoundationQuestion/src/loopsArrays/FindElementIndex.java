package loopsArrays;

public class FindElementIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,45,3,67,4,5,2,8};
        int target = 67;

        System.out.println(Find(arr,target));
    }
    public static int Find(int[] arr, int target){
        int ele = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                ele = i;
            }
        }
        return ele;
    }
}
