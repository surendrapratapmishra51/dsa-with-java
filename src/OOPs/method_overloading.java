package OOPs;
class calculator{
    public void add(int a, int b){
        int result = a+b;
        System.out.println(result);
    }

//    public void add(float a, float b){
//        float result = a+b;
//        System.out.println(result);
//    }

    public void add(double a, double b){
        double result = a+b;
        System.out.println(result);
    }
}
public class method_overloading {
    public static void main(String[] args) {

        calculator ca = new calculator();
        ca.add(10.0,20.0);

    }
}
