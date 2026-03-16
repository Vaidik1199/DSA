import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];
        arr[0] = 23;
        arr[1]= 45;
        arr[2]= 233;
        arr[3]= 543;
        arr[4]= 3;

        System.out.println(arr[3]);

        // input using for loops
        // if we do not know the size of array (int i = 0; i < arr.length; i++)
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Put the values one by one for "+i+" It will be :  ");
            arr[i] = in.nextInt();
        }
        // for printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

//       31 min      