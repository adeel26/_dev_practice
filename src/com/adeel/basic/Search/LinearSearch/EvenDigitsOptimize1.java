package com.adeel.basic.Search.LinearSearch;

public class EvenDigitsOptimize1 {
    public static void main(String[] args) {
        int[] nums = {12, 2, 346, 2355, 333, 31};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                continue; // 0 has 1 digit (odd) // Math.log10(0) → undefined (−Infinity) // Edge case
            }

            int digits = (int) Math.log10(Math.abs(nums[i])) + 1;

            if(digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
