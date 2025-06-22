package Stroy_Based_Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Mike_traveller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of String ");
        String s = sc.next();
        int N = s.length();
        HashSet<String> unique = new HashSet<>();
        for(int i = 0; i<N-2; i+=3){
            char [] arr = s.substring(i,i+3).toCharArray();
            Arrays.sort(arr);
            unique.add(new String(arr));
        }
        System.out.println(unique.size());
    }
}
