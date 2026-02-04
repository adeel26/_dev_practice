package com.adeel.Questions.BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class Q_BinarySearch8 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));
    }

    // When we find that mid > mid+1 element, that element is pivot.
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start ) / 2;
            // 4 cases over here
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]) {
                end = mid -1;
            }
            if(nums[mid] >= nums[start]) {
                start = mid + 1;
            }

        }
        return -1;
    }


    static int search(int[] nums, int target) {

    }

}

/*
Pivot cases:
1: When we find that mid > mid+1 element, that element is pivot.
2: When we find that mid < mid-1 element, that mid-1 element is pivot.
3: Start Element >= Mid-Element
   In case, where start is greater than or equal to mid, then all elements after mid will be < then start.
   Hence, we can ignore all those elements since we are  looking for peak i.e. largest element.
   Example: {4, 5, 6, 0, 1, 2, 3}
   so do, end = mid - 1
4: Start Element <= Mid-Element
   {3,4,5,6,2}
   then Start = mid + 1




Case 1: nums[mid] > nums[mid+1]
You are comparing:
mid  →  mid+1
❓ What if mid == end ?
Then:
mid+1 ❌ DOES NOT EXIST

🚨 Array index out of bounds crash.

So we say:
mid < end
✅ “Only check mid+1 if it exists”

Case 2: nums[mid] < nums[mid-1]
Now you compare:
mid-1  ←  mid
❓ What if mid == start ?
Then:
mid-1 ❌ DOES NOT EXIST

🚨 Again, crash.

So we say:
mid > start

✅ “Only check mid-1 if it exists”


Why BOTH checks are needed?
Because mid can be anywhere:
start
middle
end

And arrays are strict — you can’t go:
left of index 0
right of index n-1

 */