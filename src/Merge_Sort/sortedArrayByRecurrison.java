package Merge_Sort;

import org.w3c.dom.ls.LSOutput;

public class sortedArrayByRecurrison {
    // print function
    public static void print(int [] x){
        for(int ele:x){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    // mereg function
    public static void merge(int []a,int[]b,int []c){
        int i = 0; int j = 0; int k = 0;
        while(i<a.length && j< b.length){
            if(a[i]<=b[j]){
                c[k++]= a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(j<b.length)
            c[k++]=b[j++];
        while(i<a.length)
            c[k++]=a[i++];
    }
    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n==1)
            return;
        // seperate array
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n- n / 2; i++) {
            b[i] = arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);

    }


    public static void main(String[] args) {
        int[] arr = {80, 30, 70, 50, 75, 90, 40};
        int n = arr.length;
        print(arr);
        mergesort(arr);
        print(arr);



    }
}
