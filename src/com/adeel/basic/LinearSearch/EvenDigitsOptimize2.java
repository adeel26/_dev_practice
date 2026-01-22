package com.adeel.basic.LinearSearch;

public class EvenDigitsOptimize2 {
    public static void main(String[] args) {
        int[] nums = {12, 2, 346, 2355, 333, 31, 245254};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // convert various data types (such as primitives or objects) into their string representation.
            String strNumber = String.valueOf(nums[i]);

            if(strNumber.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
