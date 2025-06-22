package OOPs.OverRiding;

class Parent{
    public void property(){
        System.out.println("Land + Cash + Gold");
    }
    public void marry(){
        System.out.println("RelativeGirl");
    }
}
class child extends Parent{
    //Overriding
    public void marry(){
        System.out.println("SomeOther Girl......");
    }
}
public class Test {
    public static void main(String[] args) {
        // Parent Object
        Parent p1 = new Parent();
        p1.property();
        p1.marry();

        System.out.println();

        // child Object
        child c1 = new child();
        c1.property();
        c1.marry();

        System.out.println();

        Parent p2 = new child();
        p2.property();
        p2.marry();
    }
}
