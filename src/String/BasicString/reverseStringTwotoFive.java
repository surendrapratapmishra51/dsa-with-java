//Q. Input a string of length greater than 5 and reverse the substring from position 2 to 5 using inbuilt
//functions

package String.BasicString;

import java.util.Scanner;

public class reverseStringTwotoFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message of String which is greater than 5: = ");
        String s = sc.nextLine();
        int n = s.length();

        if(n>5) {
            String reversedString = reverse(s, 2, 5);
            System.out.println("original String: " + s);

            System.out.println("reversed String =" + reversedString);
        }
        else{
            System.out.println(" plaese enter string greater than 5 in length");

    }
}

    public static String reverse(String str,int start,int end) {

        // Extract the substring from position 2 to 5
        String substringToReversed = str.substring(start, end + 1);

        // reverse the substring using StringBuilder
        StringBuilder reverseSubstring = new StringBuilder(substringToReversed).reverse();

        // replace the reversed substring in the original string

        return str.substring(0, start) + reverseSubstring + str.substring(end+1);
       //  int n = str.length();


    }

    }
