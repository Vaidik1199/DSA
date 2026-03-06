import java.util.Scanner;

public class Q3switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        switch (day) {  //by clicking on switch and pressing buttons alt plus enter we get replacement of older and newer version of switch and also the if-else format
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
        // for another case of output
        int day1 = in.nextInt();
            switch (day1) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("weekday");
                    break;
                case 6:
                case 7:
                    System.out.println("weekend");
                    break;
            }

        // Enhanced one is like
//      switch (day1) {
//         case 1, 2, 3, 4, 5 -> System.out.println("weekday");
//         case 6, 7 -> System.out.println("weekend");
//      }
    }
}
