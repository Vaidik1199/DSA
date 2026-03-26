public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,42,56,7,89,123,67,33};

        System.out.println(Minimum(arr));
    }

    public static int Minimum(int[] arr) {

        if(arr.length==0){
            return -1;
        }
        int min = 0;
        for (int idx = 0; idx < arr.length; idx++) {

            if(arr[idx] < arr[min]){
                min = idx;
            }
        }
        return arr[min];
    }
}
