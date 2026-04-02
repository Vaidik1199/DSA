public class FloorNumber {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 100;
        System.out.println(FloorNUM(arr,target));
    }

    private static int FloorNUM(int[] arr, int target) {

        // what if the target is smaller than the smallest number in the array.
        // this is negligible because we know that the default it will show -1
        // because the previous index of zero is always -1
//        if(target<arr[0]){
//            return -1;
//        }
        // so better neglecting this upper part

        int start = 0;
        int end = arr.length -1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
