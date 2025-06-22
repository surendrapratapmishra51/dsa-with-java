package Leetcode;

public class array {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 9, 67, 35, 69, 76, 7};
        int n = arr.length;
        int maxindx = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n;i++) {
            max = Math.max(arr[i], max);
            if (arr[i] == max) {
                maxindx = i;
            }
        }
        System.out.println(maxindx+" ");
    }
}
