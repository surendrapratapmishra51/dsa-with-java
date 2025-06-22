package arrays.Array_revision;

import java.util.Scanner;

public class nextGreatestNumber_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");

        int ans[] = new int[n];
        ans[n-1] = -1;
        int nge = -1;
        int max = Integer.MIN_VALUE;
        for (int i = n-2; i>=0; i--){
            nge = Math.max(nge,arr[i]);
            ans[i] = nge;

        }
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
