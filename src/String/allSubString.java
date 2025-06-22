package String;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class allSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        int n = s.length();
        List<String> subString = new ArrayList<>();
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<=n; j++){
                subString.add(s.substring(i,j));
            }
        }
        System.out.println(subString);
        HashMap<String,Integer>map = new HashMap<>();
        int m = subString.size();
        for(int i = 0; i<m; i++){
            String ch = subString.get(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }
        }
        int count = 0;
        for( String ele : map.keySet()){
            int val = map.get(ele);
            if(val >=3) count++;
        }
        System.out.println(count);
    }
}
