package arrays;

import java.util.Scanner;

public class searchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the target = ");
        int x = sc.nextInt();

        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter the element of array = ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false; // element not found

        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                flag = true;
                break;
            }

        }
        if(flag== true)
            System.out.print("Element found");
        else
            System.out.print("Element are not found");


    }
}
