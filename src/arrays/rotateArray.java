package arrays;

import java.util.Scanner;


public class rotateArray {
    public static void main(String[] args) {
        int [] arr = {12,34,56,78,98,76,90};
        //int n = arr.length;
        int k = 2;

        rotate(arr,k);
        for (int num : arr) {
            System.out.print(num+" ");
        }

        }
    public static void reverse(int[] nums, int i,int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
            }
    }
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}


