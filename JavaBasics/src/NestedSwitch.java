import java.util.Scanner;
public class NestedSwitch {
    static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int id = in.nextInt();
        String dept = in.next();

        switch (id) {
            case 1 :
                System.out.println("Vaidik HC");
                break;
            case 2 :
                System.out.println("Harry Maguire");
                break;
            case 3 :
                System.out.println("emp no 3");
                switch (dept) {
                    case "IT":
                        System.out.println("It dept");
                        break;
                    case "Management":
                        System.out.println("Management dept");
                        break;
                    default:
                        System.out.println("No departement entered");
                }
                break;
            default:
                System.out.println("enter correct emploee id bro");
        }

        // enhanced version though
//        switch (id) {
//            case 1 -> System.out.println("Vaidik HC");
//            case 2 -> System.out.println("Harry Maguire");
//            case 3 -> {
//                System.out.println("emp no 3");
//                switch (dept) {
//                    case "IT" -> System.out.println("It dept");
//                    case "Management" -> System.out.println("Management dept");
//                    default -> System.out.println("No departement entered");
//                }
//            }
//            default -> System.out.println("enter correct emploee id bro");
//        }
    }
}
