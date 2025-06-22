package recursion;

import java.util.ArrayList;

public class subsetString_important {
    static ArrayList<String> arr = new ArrayList<>(); // global
    public static void subsetprint(int i, String str,String ans){
        if(i==str.length()) {
            arr.add(ans);
            return;
        }
        char ch = str.charAt(i);
        subsetprint(i+1,str,ans+ch); // take
        subsetprint(i+1,str,ans); // not take
    }
    public static void main(String[] args) {
        String str = "Mishra";
        arr = new ArrayList<>(); // reset
        subsetprint(0,str," ");
        System.out.println(arr+" ");

    }

}
