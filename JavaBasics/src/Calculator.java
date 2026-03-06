import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.println("Enter the valid operator : // if you want to stop press 'x' , 'X' ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Give me two numbers to operate/calculate : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X')   {
                break;
            } else {
                System.out.println("Invalid Operator !!!");
            }
            System.out.println(ans);
        }
    }
}