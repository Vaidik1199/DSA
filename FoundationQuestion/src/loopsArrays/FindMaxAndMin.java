package loopsArrays;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {23, 45, 76, 45};
        System.out.println("Maximum number from the array: " + max(arr));
        System.out.println(("Minimum number fron the array: " + min(arr)));
    }

    private static int max(int[] arr) {
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maximum < arr[i]){
                maximum = arr[i];
            }
        }
        return maximum;
    }


    public static int min(int[] arr) {
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}