package Merge_Sort.QuickSort;

public class KthSmallestElement {
    static int ans;
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[],int lo,int hi){
        int mid = (lo+hi)/2;
        int pivot = arr[mid];
                int pindx = mid;
                int smallercount = 0;
                for(int i = lo; i<=hi; i++){
                    if(i==mid)continue;
                    if(arr[i]<=pivot) smallercount++;
                }
                int correctindx = lo+smallercount;
                swap(arr,pindx,correctindx);

           int i = lo; int j = hi;
           while (i<correctindx && j> correctindx){
               if(arr[i]<pivot)i++;
               else if (arr[j]>pivot)j--;
               else if (arr[i]>pivot && arr[j]<=pivot)
               swap(arr,i,j);
           }
                return correctindx;

    }
    public static void quicksort(int arr[],int lo, int hi,int k){
        if(lo>hi)return;
        if(lo == hi) {
            if (lo == k - 1)
                ans = arr[lo];
            return;
        }
        int indx = partition(arr, lo, hi);
        if(indx == k-1){
            ans = arr[indx];
            return;
        }
        if(k-1 < indx) quicksort(arr,lo,indx-1,k);
        else quicksort(arr,indx+1,hi,k);
    }
    public static void main(String[] args) {


    int arr [] = {4,9,1,2,6,5,8};
    int n = arr.length;
    ans =-1;
    print(arr);
    int k = 1;
    quicksort(arr,0,n-1,k);{
            System.out.println(ans+" ");
        }


    }
}
