package recursion;

public class removeOccuranceOf_a {
    public static void skip(int i,String str, String ans){
        if(i==str.length()) {
            System.out.print(ans);
            return;
        }
        if(str.charAt(i)!='a') ans += str.charAt(i);
        skip(i+1,str,ans);
    }
    public static void main(String[] args) {
        String str = "Surendra Pratap Mishra";

        skip(0,str," ");
    }
}
