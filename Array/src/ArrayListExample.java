import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        // syntax
        ArrayList<Integer> list  = new ArrayList<>(5);

        list.add(67);
        list.add(87);
        list.add(167);
        list.add(451);
        list.add(8988);
        list.add(67);
        list.add(87);
        list.add(167);
        list.add(451);

        System.out.println(list);

        // doing operation by using list.xyz
        list.set(0,9999);
        list.remove(4);
        System.out.println(list);

        // taking input yo yo yo
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list); // to get whole list or array

        // to get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here, list[index] syntax will not work here
        }

    }
}
