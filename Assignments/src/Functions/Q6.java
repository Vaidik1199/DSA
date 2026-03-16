package Functions;
import java.util.Scanner;


//6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        float radius = in.nextFloat();

        double areaOfCircle = Area(radius);
        double CircumOfCirlcle = Circumference(radius);

        System.out.println(areaOfCircle);
        System.out.println(CircumOfCirlcle);
    }

    private static double Circumference(float radius) {
        return 2*3.14*radius;
    }

    public static double Area(float radius) {
        return radius*radius*3.14;
    }



}
