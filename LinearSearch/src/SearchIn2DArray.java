import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 1;
        System.out.println(search(arr,target));
    }

    public static String search(int[][] arr, int target) {
        if (arr.length==0) {
            return "not applicable";
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    String ans =row+","+col;
                    return ans;
                }
            }
        }
        return "Not present";
    }
}
