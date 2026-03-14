package Functions;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        what(num);
    }

    private static void what(int num) {
        if (num % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
