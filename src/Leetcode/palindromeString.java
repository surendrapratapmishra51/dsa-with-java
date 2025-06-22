package Leetcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the string ");
        String s = sc.nextLine();
        //String s = "Surendra Pratap Mishra";
        int n = s.length();
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9^]","");
        StringBuilder x = new StringBuilder(s).reverse();
       String p = x.toString();
        System.out.println(p+" ");
       if(s.equals(p)){
           System.out.println(" true ");
       }
       else{
           System.out.println(" false");
       }


        }

}
