package GGk;

import java.util.Scanner;

public class sumOfAllDivisior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n = ");
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    sum += j;
            }
            ans +=sum;

        }
        System.out.println(ans);
    }
}
