/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

package Leetcode.Array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int me = n/2;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(nums[i] == nums[j]) count++;

            }

            if(count >me) return nums[i];
        }
        return -1;
    }
}
