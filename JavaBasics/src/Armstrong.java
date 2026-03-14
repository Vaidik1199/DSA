import java.util.Scanner;

public class Armstrong {

    static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        boolean ans = IsArmstrong(n);
        System.out.println(ans);

        for (int i = 100; i < 1000; i++){
            if (IsArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean IsArmstrong(int n){
        int original = n;
        int sum= 0;
        while (n>0) {
            int rem = n %10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }

}
