package com.adeel.Questions.Recursion.Array;

import java.util.ArrayList;

public class Q4_Return_ArrayList {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 18, 18, 9};
        System.out.println(findAllIndex(nums, 18, 0, new ArrayList<>()));
    }

    static ArrayList findAllIndex (int[] nums, int target, int index, ArrayList<Integer> list){
        if (index == nums.length) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }

        return findAllIndex(nums, target, index + 1, list);

    }


}
