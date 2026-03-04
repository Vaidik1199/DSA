public class Q1 {
    static void main(String[] args) {
        System.out.println("Question One");
        int n = 1383933;

        int count = 0;
        while ( n>0 ){
            int checknum = n%10;
            if (checknum == 3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}