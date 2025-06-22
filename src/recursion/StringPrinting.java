package recursion;

public class StringPrinting {
    public static void print(int i, String str){
        if(i==str.length()) return;
        System.out.print(str.charAt(i));
        print(i+1,str);
    }
    public static void main(String[] args) {
        String str = "Surendra Pratap Mishra";
        print(0,str);

    }
}
