package com.adeel.basic.Search.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 18, 17, 15, 11, 29, 33, 29};
        int target = 15;

        System.out.println(linearSearch(nums, target, 1, 4));
    }

    static int linearSearch(int[] nums, int target, int start, int end) {
        if (nums.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++){
            int element = nums[i];
            if(element == target){
                return i;
            }
        }

        return -1;
    }
}
