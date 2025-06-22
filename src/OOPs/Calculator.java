package OOPs;
class calc{
    public void add(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    public void multi(int a,int b){
        int result = a*b;
        System.out.println(result);
    }
}
public class Calculator {
    public static void main(String[] args) {
        calc c = new calc();
        c.add(20,40);
        c.multi(20,40);


    }
}
