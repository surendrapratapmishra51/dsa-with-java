package Leetcode;

public class sortArray {
    public static void print(int [] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int a[] ,int b[],int c[]){
        int i = 0; int j = 0; int k = 0;
        int m = a.length;
        int n = b.length;
        while(i< m && j<n){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<m) c[k++] = a[i++];
        while(j<n) c[k++] = b[j++];
    }
    public static void mergeSort(int arr[]){
        int n = arr.length;
        if(n==1) return;
//        int lo =  0;
//        int hi = n-1;
//        int mid = (lo+hi);
        int a [] = new int[n/2];
        int b [] = new int[n-n/2];
        for(int i = 0; i<n/2; i++){
            a[i] = arr[i];
        }
        for(int i = 0; i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);

    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        int n = arr.length;
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}