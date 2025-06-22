package arrays.Assignment;

import java.util.Scanner;

public class countElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of array ");
        int n = sc.nextInt();
        System.out.print(" \n Enter the value of x = ");
        int x = sc.nextInt();

       // int n = sc.nextInt();
        System.out.println("Enter the element of array ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();          // input section of arrry


        }
int count = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>x){
                count++;
            }

        }
        System.out.print(count+" ");

    }
}
