package com.adeel.Questions.BinarySearch;
// Ceiling in a sorted array
public class Q_BinarySearch1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 33, 35, 40};
        int target = 10;

        System.out.println(ceiling(nums, target));
    }

    // Ceiling = smallest number ≥ target
    static int ceiling(int[] nums, int target) {
        // Edge case: if target is greater than largest element
        if (target > nums[nums.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end ) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target == nums[mid]) {
                return mid;
            }
        }

        return start;
    }
}

/*
Examples :

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
Output: 2
Explanation: Smallest number greater than 5 is 8, whose index is 2.

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 20
Output: -1
Explanation: No element greater than 20 is found. So output is -1.

Input: arr[] = [1, 1, 2, 8, 10, 10, 12, 19], x = 0
Output: 0
Explanation: Smallest number greater than 0 is 1, whose indices are 0 and 1.
The index of the first occurrence is 0.
 */