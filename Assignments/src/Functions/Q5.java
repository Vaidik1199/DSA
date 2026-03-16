package Functions;
//5. Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Put two numbers of their product");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = product(num1,num2);
        System.out.println("The product of two numbers "+ num1 + " and " + num2 +" is "+ ans);

    }
    public static int product(int num1, int num2) {
        return num1*num2;
    }

}
