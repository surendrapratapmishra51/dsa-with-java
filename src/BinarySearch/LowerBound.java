package BinarySearch;

public class LowerBound{
    public static void main(String[] args) {
        int arr [] = { 2,4,6,7,8,9,23,45,67,88};
        int n = arr.length;
        int target = 23                                                                                                                              ;
        int lb = n;
        int i = 0; int j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if (arr[mid]>=target){
                lb = Math.min(lb,mid);
                j = mid-1;

            }
            else
                i = mid +1;

            }
        System.out.println(lb);


    }
}
