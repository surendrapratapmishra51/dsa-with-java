package arrays;

import java.util.Scanner;

public class twoSum2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
         int size = sc.nextInt();
         int[]arr = new int[size];
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();

        }
        int x = 10;
        for (int i = 0; i <size; i++) {
            for (int j = i+1; j <size ; j++) {

                if(arr[i]+arr[j] == x){
                    System.out.print(arr[i]+" "+arr[j]);
                }


            }

        }

    }
}
