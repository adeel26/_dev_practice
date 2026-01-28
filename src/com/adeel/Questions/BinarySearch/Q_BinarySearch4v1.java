package com.adeel.Questions.BinarySearch;

import java.util.Arrays;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

public class Q_BinarySearch4v1 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        // check for first occurrence if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        result[0] = start;
        result[1] = end;

        return result;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean firstStartingIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target == nums[mid]) {
                // potential answer found
                ans = mid;
                if (firstStartingIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

        }

       return ans;

    }

}
