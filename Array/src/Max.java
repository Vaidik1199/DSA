public class Max {
    public static void main(String[] args) {
        int[] arr = {100,24,67,34,83,34,29,76};

        System.out.println(max(arr));
        System.out.println((maxRange(arr,2,5)));
    }

    public static int max(int[] arr) {

        //adding edge cases over here
        if (arr.length == 0){
            return -1;
        }

        int big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(big < arr[i]){
                big = arr[i];
            }
        }
        return big;
    }

    public static int maxRange(int[] arr, int start, int end) {

        //adding the edge cases over here be like
        if(end>start) {
            return -1;
        }

        if(arr == null) {
            return -1;
        }

        int big = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
    return big;
    }
}
