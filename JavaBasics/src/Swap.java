public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap no code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a+" "+ b);    // no swapping will happen by this
    }
    static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
