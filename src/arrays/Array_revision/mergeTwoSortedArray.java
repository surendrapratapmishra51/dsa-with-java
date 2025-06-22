package arrays.Array_revision;

import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] ={11,22,33,44,55,};
        int b[] = {10,20,30,40,50};
        int c[] = new int[10];
        int n = a.length;
        int m = b.length;

        int i = 0;
         int j = 0;
         int k = 0;
        while(i<n && j<m){
            if(a[i]<=b[j]) {
                c[k] = a[i];
                i++;
                k++;

            }
            else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
           if(i==n){
               while(j<m){
                   c[k]= b[j];
                   k++;
                   j++;
               }
           }
           if(j==m){
               while(i<n){
                   c[k]= a[i];
                   k++;
                   i++;
               }
           }
           for(int ele:c){
               System.out.print(ele+" ");
           }

    }
}
