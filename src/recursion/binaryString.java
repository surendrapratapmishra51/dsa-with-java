package recursion;

import java.util.Scanner;

public class binaryString {
    public static void printString(String s,int n){
        int m = s.length();
        if(m==n) {
            System.out.println(s);
            return;
        }

        if(m==0||s.charAt(m-1)=='0'){
            printString(s+1,n);
            printString(s+0,n);
        }
        else{
            printString(s+0,n);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = sc.nextInt();
        printString("",n);
    }
}
