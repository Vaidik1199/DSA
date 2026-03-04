import com.sun.security.jgss.GSSUtil;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st no : ");
        int a = input.nextInt();
        System.out.println("Enter the 2nd no : ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("The sum of two numbers is : "+ sum);

        int sub = a - b;
        System.out.println("The sub of two numbers is : "+sub);


        // if the developer want to put integer and if we put float then it will give error
        // if developer wants to put float and if we put normal int then it will not give error it will give value in the float format
        // ex ; 35  35
        // = 70.0~``````````A
    }
}

