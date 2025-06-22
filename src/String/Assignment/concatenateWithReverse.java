package String.Assignment;

import java.util.Scanner;

public class concatenateWithReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of even lenght: ");
        String s = sc.nextLine();
        int n = s.length();
        System.out.println(" original String " + s);

        String ans = Concate(s);
        System.out.println(ans);

    }
        public static String Concate(String str) {

        int n = str.length();
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            System.out.println("Reversed String " + sb);
            String reversed = sb.toString();
return str.concat(reversed);
        }



}
