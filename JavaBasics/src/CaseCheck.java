import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char a = inp.next().trim().charAt(0);

        if(a >='a' && a<='z'){
            System.out.println(a+" Is Lower Case");
        } else if(a>='A' && a<='Z'){
            System.out.println(a+" Is Upper Case");
        }else{
            System.out.println("Wrong input");
        }


    }

}