package sorting;

import java.util.Arrays;

import static sorting.BubbleSort.print;

public class minimumSumOfTwoNumberFormedFromZeroToNine {
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void Sorting(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    // swapt the arr[j] and arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;

                    swap(arr,j,j+1);
                }

            }

        }

    }
    public static void sum(int[]arr) {
        int n = arr.length;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + i;
            } else {
                num2 = num2 * 10 + i;
            }
        }

        int sum = num1 + num2;
        System.out.println(sum + " ");
       // return sum;


    }


    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 3, 0, 2, 9, 7, 8, 6};
        int n = arr.length;

        print(arr);

      //  Arrays.sort(arr);
        Sorting(arr);
        print(arr);
        sum(arr);
    }

}
