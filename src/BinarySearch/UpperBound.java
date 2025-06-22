package BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int arr [] = { 3,5,7,8,9,12,34,56,77,99};
        int n = arr.length;
        int ub = n;
        int target = 9;
        int i = 0; int j = n-1;

        while(i<=j) {
            int mid = (i + j) / 2;
            if (arr[mid] > target) {
                ub = mid;
                j = mid - 1;
            } else
                i = mid + 1;
        }
        System.out.println("upper bound = "+ub);
    }
}
