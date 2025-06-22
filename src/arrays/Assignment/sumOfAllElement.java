package arrays.Assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sumOfAllElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();

        }
        int prod = 1;

        for (int i = 0; i < n; i++) {
            prod *= arr[i];


        }
        System.out.print(prod);
    }
}
