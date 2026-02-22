package com.adeel.Questions.CyclicSort;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class Q_CyclicSort4 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> duplicates = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) {
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
