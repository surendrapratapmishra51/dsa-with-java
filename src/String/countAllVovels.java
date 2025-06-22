package String;

import java.util.Scanner;

public class countAllVovels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string - ");
        String str = sc.nextLine();

        int n = str.length();
        int count = 0;

        for (int i = 0; i <n; i++) {
            char ch = str.charAt(i);
            if(isVovels(ch) == true)
                count++;


        }
        System.out.print(count);
    }
    public static boolean isVovels(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;

        return false;
    }


    }





