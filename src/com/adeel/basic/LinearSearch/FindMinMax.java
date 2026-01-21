package com.adeel.basic.LinearSearch;

public class FindMinMax {
    public static void main(String[] args) {
        int[] nums = {23, 18, 17, 15, 11, 29, 33, 7, 29};
        System.out.println(findMin(nums));
        System.out.println(findMax(nums));
        System.out.println(findMax(nums, 1, 5));

    }

    static int findMin(int[] nums) {
        if(nums.length == 0) {
            System.out.println("Array is empty");
            return Integer.MAX_VALUE;
        }

        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    static int findMax(int[] nums) {
        if(nums.length == 0) {
            System.out.println("Array is empty");
            return Integer.MIN_VALUE;
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    static int findMax(int[] nums, int start, int end) {
        if(nums.length == 0) {
            System.out.println("Array is empty");
            return Integer.MIN_VALUE;
        }

        int max = nums[start];
        for (int i = start+1; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }



}
