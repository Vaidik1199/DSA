import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);


        // type casting
        int num1 = (int)(67.56f);
        System.out.println(num1);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        // max value of byte is 256
        System.out.println(b);
        //  the output will be 1
        // because the remainder is ,
        // it will give 257%256 then it will be 1

        byte e = 40;
        byte f = 50;
        byte g = 100;
        int h = (e*f)/g;  // here the expression operation will be perform directly by making it int
        System.out.println(h);

        int number = 'A';
        System.out.println(number);


        // java is vast its working on  unicode values
        // means if i println("नंबर")
        // it will print it directly



        // example of promotion
        byte y = 42;
        char z = 'a';
        short n = 1024;
        int i = 50000;
        float w = 5.67f;
        double m = 0.1234;
        double result = (w*y) + (i/z) - (m-n);
        System.out.println((w*y) +"  " +(i/z)+ "  "+ (m-n));
        System.out.println(result);
    }
}