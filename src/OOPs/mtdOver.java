package OOPs;
class Sample1{
    public void methodeOne(String s){
        System.out.println("String version.........");
    }


    public void methodeOne(StringBuffer o){
        System.out.println("StringBuilder version.........");
    }

    public void methodeOne(Object o){
        System.out.println("object version.........");
    }
}

public class mtdOver {
    public static void main(String[] args) {
        Sample1 st = new Sample1();
        st.methodeOne(new String("surendra"));
        st.methodeOne(new StringBuffer("surendra")); // ambigous error occur
         // reference to methodeOne is ambiguous
    }
}

