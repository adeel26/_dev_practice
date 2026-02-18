package com.adeel.Questions.CyclicSort;
// https://leetcode.com/problems/missing-number/description/

public class Q_CyclicSort1 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }

        // Search for missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j){
                return j;
            }
        }

        // Case 2: If all numbers are in place, missing number is n
        return nums.length;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

/*
Numbers from 0 till N => Total there will be N+1 number

 */