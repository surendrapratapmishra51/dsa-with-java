package recursion;
import java.util.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class permutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        ArrayList<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        String str = "";
        int n = s.length();
        perm(s,str,set);
        for(String x : set){
            ans.add(x);
        }
        System.out.print(ans);
    }

    private static void perm(String s, String str,HashSet<String> set) {
        if(s.length()==0){

            set.add(str);
            return;
        }
        for(int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            perm(left+right,str+ch,set);
        }

    }
}
