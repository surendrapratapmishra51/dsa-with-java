package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class subArray {
    public static void main(String[] args) {
        int nums[] = {2, 4, -6, 5};
        int n = nums.length;
        ArrayList<List<Integer>> sb = new ArrayList<>();

        // Loop through every possible starting index
        for (int i = 0; i < n; i++) {
            // Loop through every possible ending index starting from i
            for (int j = i; j < n; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                // Add elements from i to j
                for (int k = i; k <= j; k++) {
                    list.add(nums[k]);
                }
                sb.add(list); // Add the subarray to the result list
            }
        }
         int max = Integer.MIN_VALUE;
        int indx = -1;
        for (int i = 0; i< sb.size(); i++) {
            int sum = 0;
            for (int j = 0; j < sb.get(i).size(); j++) {
                sum += sb.get(i).get(j);
                if (sum > max) {
                    max = sum;
                    indx = j;
                }
            }

        }

        // Print the subarrays
        System.out.println(sb);
        System.out.println(sb.size());
        System.out.println(sb.get(indx));
    }
}
