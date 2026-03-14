package Functions;

// Write a program to print the sum of two numbers entered by user
// by defining your own method.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = sum(num1,num2);
        System.out.println(sum);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
