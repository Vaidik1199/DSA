// leetcode: 1295;
//https:leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=math

public class EvenDIgits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }


    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 ==0;
    }

    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
