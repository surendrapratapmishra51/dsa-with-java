package String.Assignment;

import java.util.Scanner;

public class VowelsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :: ");
        String s = sc.nextLine();
        int n = s.length();

        int NumberOfSubstring = countSubstring(s);
        System.out.println(NumberOfSubstring);
    }

    public static int countSubstring(String str){
        int n = str.length();
        int count = 0;
        for (int i = 0; i <n; i++) {
            for (int j = i + 1; j < n; j++) {
                String subString = str.substring(i, j);
                if (ContainOnlyVowels(subString)) {
                    count++;
                }

            }

        }
            return count;

    }

    public static boolean ContainOnlyVowels(String str) {
        int n = str.length();
        boolean vowels = true;
        str = str.toLowerCase();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                vowels = false;

            }


        }
        return vowels;

    }

}
