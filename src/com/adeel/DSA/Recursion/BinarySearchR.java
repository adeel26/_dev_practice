package com.adeel.DSA.Recursion;

public class BinarySearchR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 4;
        System.out.println(binarySearchRecursion(arr, target, 0, arr.length - 1));
    }

    static int binarySearchRecursion(int[] arr, int target, int s, int e) {
        // Base case: if start index crosses end, element not found
        if (s > e) {
            return -1;
        }

        // Find middle index (safe way to avoid overflow)
        int m = s + (e - s) / 2;

        // If middle element is the target → return its index
        if (arr[m] == target) {
            return m;
        }

        // If target is smaller than middle element,
        // search in LEFT half (start to mid-1)
        if (target < arr[m]) {
            return binarySearchRecursion(arr, target, s, m - 1);
        }

        // If target is greater than middle element,
        // search in RIGHT half (mid+1 to end)
        return binarySearchRecursion(arr, target, m + 1, e);
    }
}

/*
Important point:
Variables:
-> Arguments
-> Return type
-> Body of function

Pass those arguments which will be required again in recursive function calls.
Set those variable in function of body which are not required in recursive calls.
 */