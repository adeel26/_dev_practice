package com.adeel.Questions.Recursion.Array;

// Check if array is sorted recursively

public class Q1_CheckSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,11,13};
        System.out.println(isSortedRecursive(nums, 0));
    }
    
    static boolean isSortedRecursive (int[] nums, int index) {
        // Base condition
        if (index == nums.length - 1) {
            return true;
        }

        return nums[index] < nums[index + 1] && isSortedRecursive(nums, index + 1);
    }
    
}

/*
🟢 Example 1: Sorted array

Array:

[1, 2, 3, 4]
🌳 Recursion Tree
isSorted(0)
   |
   | 1 <= 2 ✔️
   ↓
isSorted(1)
   |
   | 2 <= 3 ✔️
   ↓
isSorted(2)
   |
   | 3 <= 4 ✔️
   ↓
isSorted(3)   ← BASE CONDITION
   |
   | return true
🔁 Returning back (important part)

Now results go back upward:

isSorted(3) → true
isSorted(2) → true && true = true
isSorted(1) → true && true = true
isSorted(0) → true && true = true

👉 Final Answer = true




🔴 Example 2: Unsorted array

Array:

[1, 2, 5, 3]
🌳 Recursion Tree
isSorted(0)
   |
   | 1 <= 2 ✔️
   ↓
isSorted(1)
   |
   | 2 <= 5 ✔️
   ↓
isSorted(2)
   |
   | 5 <= 3 ❌
   ✋ STOP
🚨 What happens here?

At isSorted(2):

false && isSorted(3)

👉 isSorted(3) is NEVER called

🔁 Returning back
isSorted(2) → false
isSorted(1) → true && false = false
isSorted(0) → true && false = false
👉 Final Answer = false


 */