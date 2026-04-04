package loopsArrays;

public class FindSumOfArray {
    public static void main(String[] args) {
        int[] arr = {23,45,76,45};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
