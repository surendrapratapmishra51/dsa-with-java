package String.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class anagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :: ");
        String s = sc.nextLine();
        String S = sc.nextLine();
        int m = s.length();
        int n = S.length();

        String s1 = s.replaceAll("\\s","");
        String s2 = s.replaceAll("\\s","");

        if(m != n){
            System.out.println("Not Anagram");
        }
        else{
            char [] c1 = s1.toLowerCase().toCharArray();
            char [] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            c1.equals(c2);
            System.out.println("anagram");

        }
    }
    }
