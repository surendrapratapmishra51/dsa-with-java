package String;

import java.util.Scanner;

public class frequencyString {
    public static void main(String[] args) {
        System.out.println(" Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int freq[]= new int [26];
        for(int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        System.out.println(n);
        for(int i = 0; i<26; i++){
            int value = freq[i];
            System.out.println(i+"="+value);
        }
    }
}
