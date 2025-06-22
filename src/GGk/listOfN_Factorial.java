package GGk;

import java.util.Scanner;

public class listOfN_Factorial {
  //  sta
    public static int fact(int m){
        if(m==0)
            return 1;
        int ans = m*fact(m-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n = ");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            fact(i);
        }
    }
}
