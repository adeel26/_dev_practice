package com.adeel.Questions.Recursion.Array;

public class Q2_LinearSearch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 18, 9};
        System.out.println(linearSearch(nums, 18,0));
        System.out.println(linearSearchIndex(nums, 18,0));
        System.out.println(linearSearchIndexLast(nums, 1,nums.length-1));
    }

    // return true if found
    static boolean linearSearch (int[] nums, int target, int index) {
        // Base condition
        if (index == nums.length) {
            return false;
        }

        return nums[index] == target || linearSearch(nums, target, index + 1);
    }

    // return index value if found
    static int linearSearchIndex (int[] nums, int target, int index) {
        // Base condition
        if (index == nums.length) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        }
        else {
            return linearSearchIndex(nums, target, index + 1);
        }

    }


    // return index value if found
    // Search from last index
    static int linearSearchIndexLast (int[] nums, int target, int index) {
        // Base condition
        if (index == -1) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        }
        else {
            return linearSearchIndexLast(nums, target, index -1);
        }

    }

}
