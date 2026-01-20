package com.adeel.Questions.Array;

import java.util.Arrays;

// Two Sum
public class Q_Array21 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums,target)));
        System.out.println(Arrays.toString(twoSums(nums,target)));
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            for (int j = i+1; j < nums.length ; j++) {
                if(complement == nums[j]){
                    int[] result  = new int[2];// return new int[] { i, j };
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return new int[] {};
    }

    static int[] twoSums(int[] nums, int target) {
        // loop for first number
        for (int i = 0; i < nums.length; i++) {

            // loop for second number (after i)
            for (int j = i+1; j < nums.length; j++) {

                // check if sum equals target
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {};
    }


}
