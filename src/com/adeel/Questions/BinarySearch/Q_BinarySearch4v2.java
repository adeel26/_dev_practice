package com.adeel.Questions.BinarySearch;

import java.util.Arrays;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

public class Q_BinarySearch4v2 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);

        return result;
    }

    static int findStartingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target == nums[mid]) {
                end = mid - 1;
            }

            if (target == nums[mid]) {
                index = mid;
            }

        }

        return index;
    }

    static int findEndingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target == nums[mid]) {
                start = mid + 1;
            }

            if (target == nums[mid]) {
                index = mid;
            }

        }

        return index;
    }

}
