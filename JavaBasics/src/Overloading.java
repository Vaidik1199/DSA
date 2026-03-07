public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("abc");
    }
// OMG we can create same name two methods or functions but with having different arguments or parameter what we can say
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }
}
