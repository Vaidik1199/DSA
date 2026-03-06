import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        // largest number finder
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//        if (a>b & a>c) {
//            System.out.println(a+" is greater");
//        } else if (b>a & b>c) {
//            System.out.println(b+" Is greater");
//        } else {
//            System.out.println(c+" is greater");
//        }

        // another method
        int max = a;
        if (b>max) {
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println(max);

        // int max = Math.max(c,Math.max(a,b));
        // sout(max);

        // using and , or in conditions
        //
        int y = 35;
        int z = 45;

        if (y == 30 && z == 40){
            System.out.println("both are true");
        } else if (y == 30 || z == 40){
            System.out.println("One of them is true");
        } else {
            System.out.println("both are wrong");
        }

    }
}