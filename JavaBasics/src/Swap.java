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
    static void swap(int num1,int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will be valid in this fucntion scope only
    }
}
