package com.adeel.Questions.Recursion.Level1;

// Palindrom Recursive
public class Q10_isPalindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num) {
        return num == reverseNumberR(num, 0);
    }

    static int reverseNumberR(int num, int rev) {
        // Base case
        if (num == 0) {
            return rev;
        }

        // recursive call
        return reverseNumberR(num / 10, rev * 10 + (num % 10));
    }
}

