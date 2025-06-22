package recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class printIncreasingAfterCalls {
    public static void print(int n){
        if(n==0) return;
        print(n-1); // call
        System.out.println(n); // work

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        print(n);

    }
}
