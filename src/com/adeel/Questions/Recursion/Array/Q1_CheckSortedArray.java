package com.adeel.Questions.Recursion.Array;

// Check if array is sorted recursively

public class Q1_CheckSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,11,13};
        System.out.println(isSortedRecursive(nums, 0));
    }
    
    static boolean isSortedRecursive (int[] nums, int index) {
        // Base condition
        if (index == nums.length - 1) {
            return true;
        }

        return nums[index] < nums[index + 1] && isSortedRecursive(nums, index + 1);
    }
    
}
