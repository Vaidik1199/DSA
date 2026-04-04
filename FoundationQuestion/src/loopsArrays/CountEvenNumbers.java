package loopsArrays;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {23, 45, 76, 45,56,80};
        System.out.println(EvenNumbers(arr));
    }
    public static int EvenNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
