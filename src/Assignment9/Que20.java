package Assignment9;

import java.util.Scanner;

public class Que20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n + 1; j++) { //  for upper Star
                if ((i + j == n + 1 || j - i == n + 1 || j == n + 1) && j != n && j != n + 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");


        }
        for (int j = 1; j <= 2 * n + 1; j++) { // for middle star
            System.out.print("*");


        }
        System.out.println(" ");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * n + 1; j++) {
                if ((i + j == n + 1 || j - i == n + 1 || j == n + 1) && j != n && j != n + 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }
    }
}
