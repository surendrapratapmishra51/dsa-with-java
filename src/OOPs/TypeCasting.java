package OOPs;
class clc{
public void add(int a,int b){
    System.out.println("int argument");
}
public void add(float a, float b){
    System.out.println("float argument");
}
}
public class TypeCasting {
    public static void main(String[] args) {
    clc c = new clc();
    c.add(10.f,20f);
        c.add('a','b');
        c.add(10L,20L);

    }
}
