package com.adeel.basic.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 18, 17, 15, 11, 29, 33, 29};
        int target = 33;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

        System.out.println(linearSearch2(nums,target));
    }

    // Search in the array: return the index if item found
    // Otherwise if item not found, return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int i = 0; i < arr.length; i++) {
            // Check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        // This line will execute if none of the return statements above have executed
        // Hence the target not found
        return -1;
    }

    // Search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int i = 0; i < arr.length; i++) {
            // Check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }

        // returning Integer.MAX_VALUE because -1 can be any element
        return Integer.MAX_VALUE;
    }


}

// We return -1 instead of 0 because 0 can be a valid result (like index 0),
// while -1 clearly indicates failure or absence without ambiguity.