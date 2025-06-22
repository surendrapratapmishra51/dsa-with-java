package Leetcode;

public class fibonacci {
    public static int fib(int n){
        if(n<=2) return 1;
        int ans = fib(n-1)+fib(n-2);
        return ans;
    }
    public static void main(String[] args) {
        int n = 8;
        int result = fib(8);
        System.out.println(result);
    }
}
