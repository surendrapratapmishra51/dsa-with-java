package arrays.Array_revision;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println(" ");

        int j = n-1;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[j-i];
            arr[j-i] = temp;


        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    }

