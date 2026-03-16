package Functions;

import java.util.Scanner;

// 7. Define a method to find out if a number is prime or not.
public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        boolean ans = prime(num);
        System.out.println(ans);
    }

    public static boolean prime(int num) {
        int num2 = 2;
        if (num<=1){
            return false;
        }
        while (num2*num2 <= num) {
            if (num % num2 == 0) {
                return false;
            }
            num2++;
        }
        return num2*num2>num;
    }
}
