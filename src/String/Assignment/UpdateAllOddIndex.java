package String.Assignment;

import java.util.Scanner;

public class UpdateAllOddIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String od size n : ");
        String s = sc.nextLine();
        int n = s.length();

        char[] ch = s.toCharArray();
        System.out.println(ch);
        if (n%2==0){
            System.out.println(" enter the odd string");
        }
        else {
            for (int i = 1; i < n; i += 2) {
                ch[i] = '#';
            }
        }
                System.out.println(new String(ch));

    }
}
