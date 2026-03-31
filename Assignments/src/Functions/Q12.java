package Functions;

import java.util.Scanner;

//12. Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Put three numbers to check if they are pythagorean triplet or not! ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(isTriplet(a,b,c));
    }

    private static boolean isTriplet(int a, int b, int c) {

        if(a==0||b==0||c==0){
            return false;
        }
        if(a==1&&b==1&&c==1){
            return true;
        }
        if(a==b || b==c || a==c){
            return false;
        }

        int big = max(a,b,c);
        if(big == a){
           if(a*a == b*b + c*c){
               return true;
           }
        } else if(big == b){
            if(b*b == c*c + a*a){
                return true;
            }
        } else if(big==c){
            if(c*c == b*b + a*a){
                return true;
            }
        }
        return false;
    }

    private static int max(int a, int b, int c) {
        int max = 0;
        if(a>b && a>c){
            max = a;
        } else if (b>a && b>c) {
            max =b;
        } else {
            max =c;
        }
        return max;
    }
}
