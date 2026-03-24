import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // adding number of list in list for example 3 here
        // or initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // adding elements in list
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt()); // reason of using .add is we know that string are empty already
            }
        }

        System.out.println(list);
    }
}
