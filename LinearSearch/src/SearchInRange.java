public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,24,56,78,23,122,89};


        System.out.println(linearSearch(arr,56,1,5));
    }
    static int linearSearch(int[] arr, int target,int start, int end){

        // if arr length is zero
        if(arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index =start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return start;
            }
        }
        // this will execute of none of the return statement above have executed
        // hence the target is not found
        return -1;
    }
}
