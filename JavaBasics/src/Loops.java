import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers form one to five
        for (int i=1; i<6; i++){
            System.out.println(i);
        }
        // 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
            //System.out.println("Hello World");
        }
        System.out.println();
        System.out.println("While loop");
        //  While loops

        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num++;
        }


        // tip : uses of both for and while loop


        // for loop
        // use when we know the limit or ex we know the n
        // or basically we know the repeating times of loop


        // while loop
        // use when we dont know the value or the limit.


        System.out.println("Do while loop");
        // do while
        int num1 =1;
        do{
            System.out.println("Hello");
            num1++;
        } while (num1 <= 5);

        //will execute at least once
    }
}