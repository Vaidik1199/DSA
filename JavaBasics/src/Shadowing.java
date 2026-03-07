public class Shadowing {
    static int b =50;

    static int a  = 10; // this will be shadowed at below at line 12
    //if we want to use this in static down, we need to add static keyword here also just like before int
    // this also have its own scope


    public static void main(String[] args) {
        System.out.println(a);   // 10
        int a = 20;  // the class variable at line 4 is shadowed by this
        System.out.println(a);  // 20

        // if
        int b;
        // decleration done here
        // System.out.println(b); this will give error here
        // because we did not initialize yet
        b = 100;
        //scope will begin when the value is initialize
        // means after this there will be 100 value not 50 or not any error for b


        fun();

    }

    static void fun() {
        System.out.println(a); //10
    }

}
