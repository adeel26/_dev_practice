package com.adeel.Questions.BinarySearch;
// Floor in a sorted array
public class Q_BinarySearch2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 33, 35, 40};
        int target = 10;

        System.out.println(floor(nums, target));
        System.out.println( nums[floor(nums, target)] );
    }

    // Floor = greatest number ≤ target
    static int floor(int[] nums, int target) {
        // Edge case: if target is smaller than smallest element
        if (target < nums[0]) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }

        return end;
    }

}
