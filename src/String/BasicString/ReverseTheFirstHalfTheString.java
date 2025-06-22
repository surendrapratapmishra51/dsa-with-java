// Input a string of even length and reverse the first half of the string.

package String.BasicString;

import java.util.Scanner;

public class ReverseTheFirstHalfTheString {
    public static void main(String[] args) {
        // Input from the even lenght
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the String = ");
        String s = sc.nextLine();
        int n = s.length();

     if(n%2 ==0){
         String reverseFirsthalf = reverseFirstHalf(s);
         System.out.println(" original String = "+ s);
         System.out.print("reverse string = "+reverseFirsthalf);
        }
     else {
         System.out.println(" Please enter the valid index string");
     }
    }

    public static String reverseFirstHalf(String str) {
        int n = str.length();
        int halfLength = n / 2;

        // reverse the first half the string
        StringBuilder reverseFirstHalf = new StringBuilder(str.substring(0, halfLength)).reverse();
        // concatenate the reversed first half with the second half
        return reverseFirstHalf + str.substring(halfLength);
    }
}





