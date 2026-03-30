// leetcode: 1295;
//https:leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=math

public class EvenDIgits {
    public static void main(String[] args) {
        int[] arr = {1,24,453,267};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // fxn to check whether the number contains even digits or not;
    static boolean even(int num) {
        int count =0;
        while(num>0){
            num = num/10;
            count++;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
