import java.util.Arrays;

public class SearchInStrings {

    public static void main(String[] args) {
        String name = "Vaidik";
        char target = 'u';


        System.out.println(search(name,target));
        System.out.println(search2(name,target));

        // printing string in the form of char array
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // normal solving
    static boolean search(String str, char target) {

        // if length is zero then
        if (str.length()==0) {
            return false;
        }

        // actual loop
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        // if none of that cases happened
        return false;
    }



    // solving through for each loop
    static boolean search2(String str, char target) {

        // if length is zero then
        if (str.length()==0) {
            return false;
        }

        //for each
        for (char ch : str.toCharArray()){  // str.toCharArray() converts string into char array
            if(ch == target){
                return true;
            }
        }
        // if none of that cases happened
        return false;
    }
}