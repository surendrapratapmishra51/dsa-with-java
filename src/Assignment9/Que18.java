package Assignment9;

import java.util.Scanner;

public class Que18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            // inner loop for
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i + j == n + 1 || i - j == n - 1 || j - i == n - 1 || i + j == 3 * n - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");


        }
    }
}
