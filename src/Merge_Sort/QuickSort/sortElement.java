package Merge_Sort.QuickSort;

import java.util.Scanner;

public class sortElement {
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }

        public static void swap(int arr[],int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

        public static int partition(int arr[],int low, int hi){
            int pivot = arr[low];
            int i = low;
            int j = hi;
            while(i<j){
                while(arr[i]<=pivot && i<hi){
                    i++;}
                while(arr[j]>pivot && j>low){
                    j--;}
                if(i<j){
                    swap(arr,i,j);
                }

            }
            swap(arr,low,j);
            return j;
    }
    public static void quicksort(int arr[],int low,int hi){
        if(low>hi)
            return;
            int partindx = partition(arr,low,hi);
            quicksort(arr,low,partindx-1);
            quicksort(arr,partindx+1,hi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of arr = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
        quicksort(arr,0,n-1);
         print(arr);
    }
}
