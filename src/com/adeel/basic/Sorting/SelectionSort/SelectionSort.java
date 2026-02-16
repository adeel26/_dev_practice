package com.adeel.basic.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 3};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // find the maximum item in the remaining array and swap with correct index
            int last = nums.length - 1 - i;
            int maxIndex = getMaxIndex(nums, 0, last);

            swap(nums, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;

        for (int i = start; i <= end ; i++) {
            if(nums[max] < nums[i]){
                max = i;
            }
        }

        return max;
    }


    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}


/*
Selection sort works by selecting an extreme element
(minimum or maximum) and placing it in its correct position.

Stable: No

It performs well on small lists/arrays
 */