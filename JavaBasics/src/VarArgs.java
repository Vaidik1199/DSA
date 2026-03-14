import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

//        multiple(2,3,"four","five","yo-yo");

//        fun(2,3,4,5,6,34,5,32,255,64,1,2,3);

    }

    // mixed arguments like known and not know
    static void multiple(int a, int b, String ...v){
    }

    // variable number of arguments
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
