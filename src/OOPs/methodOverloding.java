package OOPs;
class Sample{
    public void methodeOne(String s){
        System.out.println("String version.........");
    }

    public void methodeOne(Object o){
        System.out.println("object version.........");
    }

}

public class methodOverloding {
    public static void main(String[] args) {
        Sample st = new Sample();
        st.methodeOne("surendra");
        st.methodeOne(new Object());
        st.methodeOne(null);
    }
}
