package com.adeel.Questions.Recursion.Level1;

// Reverse Number via pure recursive way (Helper Method)

public class Q9_ReverseNumberHelperMethod {
    public static void main(String[] args) {
        int num = 1824;
        int reversed = reverse(num);  // Just call reverse() - clean!
        System.out.println("Reversed number: " + reversed);
    }

    // Public method - caller doesn't need to know 'rev'
    public static int reverse(int num) {
        return reverseHelper(num, 0);  // Start recursion with rev = 0
    }

    // Private helper method does the actual recursion
    private static int reverseHelper(int num, int rev) {
        if (num == 0) {  // Base case
            return rev;
        }
        // Recursive call with updated rev
        return reverseHelper(num / 10, rev * 10 + (num % 10));
    }

}

/*
✅ Cleaner API — caller doesn’t pass rev
✅ Hides recursion details
 */