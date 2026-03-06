import java.util.Scanner;

public class funcSum {
    public static void main(String[] args) {
        // In java The functions are called as methods
//      sum();    to simply call!!!
        int ans = sum2();
        System.out.println(ans);
    }

    // return the value if needed
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the Second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

        // after returing khatam,,,, nothing will execute here after reuturn
        // this is dead land
    }


    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the Second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of both of the number is : "+ sum);
    }
}
