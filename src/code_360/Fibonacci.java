package code_360;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        if(n<=0)return 0;
        if(n==1)return 1;

        int prev2 = 0;
        int prev1 = 1;
        int current = 1;

        for(int i = 2; i<=n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
         int ans = fibo(n);
        System.out.print(ans+" ");

    }
}
