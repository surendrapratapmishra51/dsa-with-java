package String.Assignment;

import java.util.Scanner;

public class countAllConsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;

        // change upper case to lowe case
        s = s.toLowerCase();
        for (int i = 0; i <n ; i++) {
            char ch = s.charAt(i);
            if (ch !='a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }

        }
            System.out.println(count);




    }
}
