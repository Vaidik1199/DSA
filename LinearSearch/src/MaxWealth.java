//leetcode:1672;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {2,3,4},
                {3,3,5}
        };
        System.out.println(maximumWealth(accounts));
;    }
    public static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            // when we start a new col, take a new sum for that row
            int rowsum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum = rowsum + accounts[person][account];
            }
            if (rowsum > ans){
                ans = rowsum;
            }
        }
        return ans;
    }
}
