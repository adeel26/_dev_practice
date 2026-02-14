package com.adeel.basic.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length-1 ; i++) {
            boolean swapped = false; // Stops if array is already sorted
            for (int j = 0; j < nums.length-1-i ; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
}
