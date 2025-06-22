package OOPs;
class person{
    public String name;
    public String address;
    public int age;
}
class Students extends person{
    public int marks;
    public char grade;
    Students(String name, String address,int age,int marks,char grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }


    public void disp(){
        System.out.println("Name is ::"+name);
        System.out.println("Address is :: "+address);
        System.out.println("Age is :: "+age);
        System.out.println("makrs is :: "+marks);
        System.out.println("grade is :: "+grade);
    }
}
public class Inheritance_App {
    public static void main(String[] args) {


        Students st = new Students("surendra", "rcb", 51, 100, 'a');
        st.disp();
    }
}
