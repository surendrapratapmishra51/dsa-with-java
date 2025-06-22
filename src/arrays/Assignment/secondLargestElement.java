package arrays.Assignment;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of array ");
        int n = sc.nextInt();
        System.out.println("Enter the element of array ");
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();          // input section of arrry


        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        int max = Integer.MIN_VALUE;
        int sle = Integer.MIN_VALUE;

        for (int i = 0; i <n; i++) {

            if(arr[i]>max){
                sle = max;
                max = arr[i];
            }
            else if(arr[i]>sle && arr[i]!=max){
                sle = arr[i];

            }

        }
        System.out.print(sle+" ");

    }


}
