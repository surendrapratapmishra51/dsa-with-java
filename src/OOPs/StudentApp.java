package OOPs;
class Student{
    // Data-security
    private int RollNo;
    private String Name;
    private  String Address;

    // setter method

    public void setRollNo(int RollNo){
        this.RollNo = RollNo;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }


    // getter method

    public int getRollNo(){
        return RollNo;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }

}
public class StudentApp {
    public static void main(String[] args) {
        Student st = new Student();
        // calling setter
        st.setRollNo(80);
        st.setName("surendra");
        st.setAddress("Rcb");

        // calling getter
        System.out.println("RollNo is "+st.getRollNo());
        System.out.println("Name is "+st.getName());
        System.out.println("Address is "+st.getAddress());

    }
}
