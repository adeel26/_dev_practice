package com.adeel.basic.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int index = binarySearch(arr, target);

        if(index != -1) {
            System.out.println("Target found at index: " + index);
        }
        else{
            System.out.println("Target not found");
        }

    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle element start + end / 2
            // safe way to find mid to avoid overflow
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target == arr[mid]){
                // it can be without condition as its only condition left
                return mid;
            }
        }
        return -1;
    }


}

/*
1️⃣ The classic formula
mid = (start + end) / 2;

Looks simple, right? ✅
But start + end can overflow if the numbers are big.
Example of overflow
Suppose:

int start = 2_000_000_000; // 2 billion
int end   = 2_000_000_001;

start + end = 4_000_000_001
Problem:
int in Java can hold only up to 2_147_483_647

So start + end overflows → negative number → wrong mid → crash or wrong search

2️⃣ The safe formula
mid = start + (end - start) / 2;

Why this is safe
end - start = difference between start and end
Example: 2_000_000_001 - 2_000_000_000 = 1 ✅ no overflow
Divide by 2 → still safe
Add to start → still safe

Step by step
mid = start + (end - start) / 2;
mid = 2_000_000_000 + (1 / 2)  // integer division → 0
mid = 2_000_000_000

✅ Works perfectly
❌ No overflow

3️⃣ Why we use this formula
Prevents integer overflow
Guarantees correct mid even with huge arrays
Modern “best practice” in interviews

4️⃣ Important note
In small arrays, both formulas work fine
But in real-world or coding platforms, they test big input arrays to check your awareness

🔹 Memory trick for interviews
“Don’t sum directly. Sum difference first.”
Formula:
mid = start + (end - start) / 2
Think: “I measure distance from start, then go half way.”

 */