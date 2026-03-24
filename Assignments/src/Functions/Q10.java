package Functions;
//10. Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Provide a num check if its palindrome number or not: ");
        int num = in.nextInt();

        Check(num);
    }

    private static void Check(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num!=0) {
            int digit = num%10;
            reversedNum = reversedNum * 10 + digit;
            num=num/10;
        }
        if (originalNum==reversedNum){
            System.out.println(originalNum + " is a palindrome number ");
        } else {
            System.out.println(originalNum+ " is not a palindrome number");
        }
    }
}