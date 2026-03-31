package Functions;
//13. Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = in.nextInt();

        System.out.print("Enter the limit number: ");
        int end = in.nextInt();

        primenums(start,end);
    }

    public static void primenums(int start, int end) {
        for (int i = start; i <= end ; i++) {
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isprime(int i) {
        if(i<2) return false;

        for (int j = 2; j*j<= i ; j++) {
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
}
