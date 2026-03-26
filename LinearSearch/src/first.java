public class first {

    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    // search in the array
    // will return the index if item found
    // will return -1 if not found
    static int linearSearch(int[] arr, int target){

        // if arr length is zero
        if(arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this will execute of none of the return statement above have executed
        // hence the target is not found
        return -1;
    }
}