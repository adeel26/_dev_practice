package com.adeel.Questions.CyclicSort;
// https://leetcode.com/problems/find-the-duplicate-number/


public class Q_CyclicSort3 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        int duplicate = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                if (i != correctIndex) {
                    duplicate = nums[i]; // actual duplicate
                }
                i++;
            }
        }
        return duplicate;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
