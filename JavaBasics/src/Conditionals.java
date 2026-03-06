public class Conditionals {
    public static void main(String[] args) {
        int salary = 18000;
        if (salary > 15000){
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        float marks=  89.76f;
        if (marks>90){
            System.out.println("Distinction");
        } else if(marks>60){
            System.out.println("First Class");
        } else if(marks>40){
            System.out.println("Pass");
        }else{
            System.out.println("fail");
        }
    }
}