public class PeakOfMountainBitonicArray {
    public static void main(String[] args) {

    }
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int start = 0 ;
            int end = arr.length - 1;
            while(start < end){
                int mid = start + (end-start)/2;
                if(arr[mid]>arr[mid+1]){
                    end = mid;
                } else{
                    start = mid+1;
                }
            }
            return start;
        }
    }

    // dont watch it, it just remainder
    // my approach
//    public int peakIndexInMountainArray(int[] arr) {
//        int start = 0 ;
//        int end = arr.length - 1;
//        while(start>Integer.MIN_VALUE){
//            int mid = start + (end-start)/2;
//            if(arr[mid]>arr[mid+1]){
//                return mid;
//            } else if(arr[mid]<arr[mid-1]){
//                end = mid-1;
//            } else {
//                start = mid+1;
//            }
//        }
//        return -1;
//    }
}
