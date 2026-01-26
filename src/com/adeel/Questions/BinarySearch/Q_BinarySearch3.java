package com.adeel.Questions.BinarySearch;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Q_BinarySearch3 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';

        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid + 1;
            }
            else if (target < letters[mid]) {
                end = mid - 1;
            }
            else if (target == letters[mid]) {
                start = mid + 1;
            }
        }

        return letters[start];
    }
}
