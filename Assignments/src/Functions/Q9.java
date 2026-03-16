package Functions;

import java.util.Scanner;

//9. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//        4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//Also,
//        1! = 1
//        0! = 1
public class Q9 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter your number to do factorial : ");
        int num = in.nextInt();

        long fact = Factorial(num);
        System.out.println(fact);
    }

    public static long Factorial(int num) {
        long ans=1;
        if (num>1) {
            for (int i = 1; i <= num; i++) {
                ans = ans* i; //ans *= i;
            }
        } else if (num==0) {
            return ans;
        } else {
            ans=-1;
        }
        return ans;
    }

}
