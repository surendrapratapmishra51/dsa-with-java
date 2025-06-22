package OOPs;
class cal {

    // General method
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public void add(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }
}

     class adv{
    // var-args method
        public void add(int...args){
            int result = 0;
            for(int data:args){
                 result += data;
            }
            System.out.println(result);
        }
     }


public class var_args {
    public static void main(String[] args) {

        cal c = new cal();
        c.add(20,30);
        c.add(20,30,40);
        c.add(10,20,30,40);
        c.add(10,20,30,40,50);

        System.out.println("Advance java class");
        // var-args take 0 to n argument
         adv ca = new adv();
         ca.add(0);
         ca.add(10);
         ca.add(20,30);
         ca.add(40,50,20);
         ca.add(50,60,30,20);
    }
}
