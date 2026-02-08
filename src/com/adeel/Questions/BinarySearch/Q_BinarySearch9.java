package com.adeel.Questions.BinarySearch;
// Find the Rotation Count in Rotated Sorted Array
// https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/

public class Q_BinarySearch9 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(countRotations(nums));
    }

    static int countRotations(int[] nums) {
        int pivot = findPivot(nums);
        return pivot + 1;
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start ) / 2;
            // 4 cases over here
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid -1;
            }
            if(nums[mid] >= nums[start]) {
                start = mid + 1;
            }

        }
        return -1;
    }

}
