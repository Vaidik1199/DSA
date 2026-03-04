import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        String a = "Kunal";
//        String b = "Kunal";
//        System.out.println(a==b); // this will give true //this also checks the refrence of this two strings


//         .equals only check the value //.equals checkking only value not refrence

//        if( fruit.equals("mango")) {
//            System.out.println("King of Fruit");
//        }
//        // else is not required or it is optional because this both are independent terms
//        if(fruit.equals("apple")) {
//            System.out.println("Sweet red fruit");
//        }
        // here this is look like a mess or traash so use switches yahhhh!!!

        // cases have to be as same type as expressions, must be constant or literal
        // duplicate case values are not alllowed
        // break is use to terminate the sequence
        // if break is not used it will continue to next case
        // default will execcuste when none of the above does
        // if default is not at the end, put break after it

        // syntax

//        switch (expression) {
//            case 1:
//                do something
//                break;
//            case 2:
//                do something
//                break;
//            default:
//                do something
//        }

        switch (fruit) {
            case "mango":
                System.out.println("the king of the fruit");
                break;
            case "apple":
                System.out.println("The sweetest among all");
                break;
            // suppose there were no break here
            // then if the input is apple then the output will be
            // The sweetest among all
            //wrong input bro       //all rest after the chosen case
            default:
                System.out.println("wrong input bro");
                break;
            // and the default should be at the end always


            //this is the new method of the switch statement bro
//            switch (fruit) {
//                case "mango" -> System.out.println("the king of the fruit");
//                case "apple" -> System.out.println("The sweetest among all");
//                default -> System.out.println("wrong input bro");
        }
    }
}