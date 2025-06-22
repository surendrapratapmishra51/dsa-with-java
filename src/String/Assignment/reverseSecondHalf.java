package String.Assignment;

import java.util.Scanner;

public class reverseSecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String of even lenght: ");
        String s = sc.nextLine();
        int n = s.length();
        int mid = n / 2;
        if (n%2==0) {
            String SecondReverse = reverseHalf(s);
            System.out.println(SecondReverse);

        }
        else{
            System.out.println("enter the valid string");
        }
    }

    public static String reverseHalf(String s) {
        int n = s.length();
        int mid = n / 2;


            // String halfSubstring = s.substring(mid);
            StringBuilder sb = new StringBuilder(s.substring(mid, n));
        sb.reverse();

        return s.substring(0, mid) + sb;




        }

    }

