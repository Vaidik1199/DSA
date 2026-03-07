import java.util.Scanner;

public class StringExampleFunc {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("put your name here : ");
        String naam = in.next();

        String personalized = myGreet(naam);
        System.out.println(personalized);
    }
// the naam and name, both variable needs not be same,
// will discuss it later
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are You ???";

        return greeting;
    }
}
