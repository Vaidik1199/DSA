public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "vaidik";
//        System.out.println(marks);
//        System.out.println(num);
        // this is simply not possible due to scop


        // for loop also haas scoping
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        //System.out.println(i); // this is simply just not possible




        {
            // block scoping omg
            //int a = 78;  it will give me reinitialization will not happen
            a = 88; // we can do modification
            int c = 99;

            name = "bruhhh";
            System.out.println(name); // will be bruhhh
        }

        //System.out.println(a) will give 88, yo yo yes
        // System.out.println(c);// is not possible
        // for block scopes in same function have this rules
        // values initialized in that block will remain in that block
        // and also we can not repeat the initialization of outsiders, we can modify outsiders

        //System.out.println(name) will be bruhhh here also
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    } // scope is means we can only access this variables inside this fucntion only!
}
