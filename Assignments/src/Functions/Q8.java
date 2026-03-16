package Functions;
//8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks, know your grade : ");
        int marks = in.nextInt();

        String Grade = Grades(marks);
        System.out.println("This is the grades according to your marks "+ marks + " : "+ Grade);
    }

    public static String Grades(int marks) {
        String Grade;
        if (marks>90){
            return Grade="AA" ;
        } else if (marks>80 && marks<91){
            return Grade="AB";
        } else if (marks>70 && marks<81) {
            return Grade="BB";
        } else if (marks>60 && marks<71) {
            return Grade="BC";
        } else if (marks>50 && marks<61) {
            return Grade="CD";
        } else if(marks>40 && marks<51) {
            return Grade = "DD";
        } else if(marks>0 && marks<41) {
            return Grade="FAIL";
        } else {
            return Grade = "WRONG MARKS";
        }
    }
}
