package Functions;

//A person is eligible to vote if his/her age is greater than or equal to 18.
//Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        vote(num);

    }

    public static void vote(int num) {
        if (num >= 18 && num > 0) {
            System.out.println("You can VOTE, Mr/Mrs Eligible");
        } else {
            System.out.println("You can not vote, So SAD!");
        }
    }
}
