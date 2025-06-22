package Merge_Sort.QuickSort;

public class KthLargest {
    public static void print(int arr[]){
        for(int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partioned(int arr[],int lo,int hi){
        int privot = arr[lo]; int pndx = lo;
        int smallercount = 0;
        for(int i = lo+1; i<=hi; i++){
            if(arr[i]<=privot) smallercount++;
        }
        int correctIndx = pndx+smallercount;
        swap(arr,pndx,correctIndx);
        int i = lo; int j = hi;
        while(i<correctIndx && j>correctIndx){
            if(arr[i]<=privot) i++;
            else if (arr[j]>privot) j--;
            else if (arr[i]>privot && arr[j]<=privot) {
                swap(arr,i,j);


            }

        }
        return correctIndx;
    }
    public static void quickSort(int[] arr, int lo, int hi) {
        if(lo>=hi) return;
        int idx = partioned(arr,lo,hi);
        quickSort(arr,lo,idx-1);
        quickSort(arr,idx+1,hi);

    }

    public static void main(String[] args) {
        int arr[] = {4,9,7,1,2,3,6};
        int n = arr.length;
        quickSort(arr,0,n-1);
       print(arr);
    }





}
