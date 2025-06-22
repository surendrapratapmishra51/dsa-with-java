package GGk;

public class SortingByMergeSort {
    public static  void print(int [] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
    }
    public static void merge(int[] a, int [] b, int [] c){
        int m = a.length;
        int n = b.length;
        int i = 0; int j = 0; int k = 0;
        while(i<m&& j<n){
            if(a[i]<=b[j]){
                c[k++] = a[i++];
            }
            else c[k++]= b[j++];
        }
        while(i<m) c[k++]= a[i++];
        while(j<n) c[k++] = b[j++];
    }
    public static void mergesort(int arr[]) {
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i];
        }

        for (int i = 0; i < n - n / 2; i++) {
            b[i] = arr[i + n / 2];
        }
        mergesort(a);
        mergesort(b);

        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int [] arr = {4,1,3,9,7};
        print(arr);
        mergesort(arr);
        print(arr);

    }
}
