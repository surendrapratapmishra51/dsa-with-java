package Leetcode;
import java.util.*;

class Solution {
    public static void sort(int arr[][]){
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
    }

    public static void main(String[] args) {
        int days = 57;
        int meetings[][] = {{3,49}, {23,44}, {21,56},{26,55},{23,52},{2,9},{1,48},{3,31}};
//    public int countDays(int days, int[][] meetings) {
        sort(meetings);
        int sum = 0;
        for(int i = 0; i<meetings.length-1; i++){
            int end = meetings[i][1];
            int next_start = meetings[i+1][0];
            if(next_start > end){
                System.out.print(next_start - end-1);
                sum += next_start - end-1;
                System.out.println("pre sum"+sum);
            }
        }
        sum += days-meetings[meetings.length-1][1];
        sum += meetings[0][0]-1;
         System.out.println(meetings[0][0]);
          System.out.println(meetings[0][1]);

          System.out.println(meetings[meetings.length-1][0]);
          System.out.println(meetings[meetings.length-1][1]);
        System.out.println("sum = "+ sum);

    }
}
