package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n; i++) {
          arr[i] = sc.nextInt();
        }
        print(arr);

        boolean flag = true;


            for (int j = 0; j <n-1; j++) {
                if (arr[j]>arr[j+1]){
                   // System.out.print("unsorted");
                    flag = false;
                    break;
                }
                    flag = true;



            }
            
        if(flag == true) System.out.print(" sorted");
         else System.out.print(" unsorted");



    }

    private static void print(int[] arr) {
        int n = arr.length;
        for (int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
