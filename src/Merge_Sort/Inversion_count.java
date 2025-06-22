package Merge_Sort;

import org.w3c.dom.ls.LSOutput;

public class Inversion_count {
    static int count;
    public static void print(int [] a){
        for (int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    public static void merge(int [] a,int [] b,int [] c){
        int i = 0; int j = 0; int k = 0;
        while(i<a.length && j<b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
            while (i < a.length) {
                c[k++] = a[i++];
            }

            while(j<b.length){
                c[k++]= b[j++];
            }

        }
        public static void mergesort(int []arr){
        int n = arr.length;
        if(n==1){
            return;
        }

        int [] a = new int[n/2];
        int [] b = new int[n-n/2];

        for(int i =0; i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i = 0;i<n-n/2; i++){
            b[i]= arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        inversion(a,b);
        merge(a,b,arr);

        }
        public static void inversion(int []a,int[] b){
        int i = 0; int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += a.length-i;
                j++;

            }
            else{
                i++;
            }
        }

        }


    public static void main(String[] args) {
       // int[] arr = {80, 30, 70, 50, 75, 90, 40};
        int [] arr = {189,33,89,27,60,10,70};
         count = 0;
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);



    }

}
