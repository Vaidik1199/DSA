package Functions;

import java.util.Scanner;

//14. Write a function that returns the sum of first n natural numbers.
public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        System.out.println(sumOfN(a));
    }

    public static int sumOfN(int a) {

        if(a<=0){
            return -1;
        }
        int ans  = 0;
        for (int i = 1; i <= a; i++) {
            ans = ans + i;
        }

        return ans;
    }
}
