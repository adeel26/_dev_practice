package com.adeel.Questions.Array;

public class Q22_CheckSorted {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,11,13};
        System.out.println(isSortedAsc(nums));
        System.out.println(isSortedDsc(nums));
    }

    static boolean isSortedAsc (int nums[]) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isSortedDsc (int nums[]) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
