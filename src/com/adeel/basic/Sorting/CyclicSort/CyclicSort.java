package com.adeel.basic.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

/*
What is Cyclic Sort (1-line)
👉 Cyclic sort is used when numbers are in a known range and each number has a “correct index”.

When SHOULD you use Cyclic Sort ✅
✅ 1. Numbers are in range 1 to N
(or 0 to N)
Example:
[3, 1, 5, 4, 2]
Length = 5
Values = 1..5
Each number belongs to index = value - 1

✅ 2. You want O(n) time (very fast)
No nested loops like bubble/insertion
Each element is swapped at most once

✅ 3. Interview problems like:
You should immediately think CYCLIC SORT when you see:
Missing number
Duplicate number
Find all missing numbers
Find the smallest missing positive
Set mismatch
(These are very common interview questions)

When NOT to use Cyclic Sort ❌
❌ Values are random (e.g., 10, 500, -3)
❌ Duplicates without constraints
❌ Floating numbers
❌ You need stable sorting

Simple Rule to Remember 🧠
If value range = index range → cyclic sort
Example
Array:
[3, 1, 5, 4, 2]

Correct positions:
1 → index 0
2 → index 1
3 → index 2
4 → index 3
5 → index 4


We keep swapping until:
nums[i] == i + 1

 */


/*
Why while Works (Key Insight 🧠)
Swap until the current index has the correct element
Only move forward when fixed
Each element reaches its correct place in O(1) swaps
 */