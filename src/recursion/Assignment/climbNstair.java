package recursion.Assignment;

import java.util.Scanner;

public class climbNstair {
    public static int stair(int n){
        if(n<=3)
            return n;
        return stair(n-1)+stair(n-2)+stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
}
