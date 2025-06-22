package recursion;

import java.util.Scanner;

public class fabonacci_Series {
    public static long fabo(long n){
        if(n<=1)
            return 1;
        else return fabo(n-1) + fabo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n = ");
        long n = sc.nextInt();
        System.out.println(fabo(n));
    }
}
