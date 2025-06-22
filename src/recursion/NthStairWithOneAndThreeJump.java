package recursion;

import java.util.Scanner;

public class NthStairWithOneAndThreeJump {
    public static int stair(int n){
        if(n<=2) return 1;
        if(n==3) return 2;
        return stair(n-1) + stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n =");
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
}
