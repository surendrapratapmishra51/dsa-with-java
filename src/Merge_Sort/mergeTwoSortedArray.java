package Merge_Sort;

public class mergeTwoSortedArray {
    public static void print(int [] a){
        for(int ele:a){
            System.out.print(ele+" ");

        }
        System.out.println();

    }
    public static void main(String[] args) {
        int [] a = {10,20,30,40,50,60,70};
        print(a);
        int [] b = {15,25,35,45,55,65,75};
        print(a);

        int m = a.length;
        int n = b.length;
        int [] c = new int[m+n];
        int i = 0; int j = 0; int k = 0;

        while(i<m && j<n) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;

            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==m)
        while(j<n){
            c[k] = b[j];
            j++;
            k++;
        }
        if(j==n)
        while(i<m){
            c[k]= a[i];
            i++;
            k++;
        }
      print(c);
        }
    }

