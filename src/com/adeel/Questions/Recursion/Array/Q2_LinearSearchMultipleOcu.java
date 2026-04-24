package com.adeel.Questions.Recursion.Array;

import java.util.ArrayList;

public class Q2_LinearSearchMultipleOcu {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 18, 18, 9};
        ArrayList<Integer> list = new ArrayList<>();

        findAllIndex(nums, 18, 0, list);
        System.out.println(list);
    }


    static void findAllIndex (int[] nums, int target, int index, ArrayList<Integer> list) {
        if (index == nums.length) {
            return;
        }

        if (nums[index] == target) {
            list.add(index);
        }
        findAllIndex(nums, target, index+1, list);

    }
}
