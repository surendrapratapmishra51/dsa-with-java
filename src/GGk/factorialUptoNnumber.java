package GGk;

import java.util.Scanner;

public class factorialUptoNnumber {
    public static int fact(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create an array to store factorials
        int[] factorials = new int[n + 1];

        // Calculate and store factorials in the array
        for (int i = 1; i <= n; i++) {
            factorials[i] = fact(i);
        }

        // Print the array
        System.out.print("Factorials up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(factorials[i] + " ");
        }
    }
}