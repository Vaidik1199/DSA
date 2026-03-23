package Functions;
//10. Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Provide a num check if its palindrome number or not: ");
        int num = in.nextInt();

        boolean output = Check(num);
        System.out.println(output);
    }

    public static boolean Check(int num) {
        String pal = "";
        int rem = 0;
        if (num>0) {
            for (int i = 0; i < num; i++) {
                rem = num % 10;
                num = num/10;
                pal = (pal + String.valueOf(rem));
            }
            return String.valueOf(num).equals(pal);
        }
        return false;
    }
}
