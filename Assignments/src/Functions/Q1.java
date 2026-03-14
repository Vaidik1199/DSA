package Functions;

import java.util.Scanner;

//Define two methods to print the maximum and
// the minimum number respectively among
// three numbers entered by the user.
public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int min = minimum(num1,num2,num3);
        System.out.println("Minimum = "+ min);

        int max = maximum(num1,num2,num3);
        System.out.println("Maximum = "+ max);
    }

    public static int minimum(int num1,int num2, int num3) {

        int min;

        if (num1 < num2 && num1 < num3){
            min = num1;
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        return min;
    }

    public static int maximum(int num1, int num2, int num3) {
        int max;

        if (num1> num2 && num1> num3){
            max = num1;
        }else if(num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        return max;
    }
}
