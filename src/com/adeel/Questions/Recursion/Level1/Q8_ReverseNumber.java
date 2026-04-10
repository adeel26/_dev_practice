package com.adeel.Questions.Recursion.Level1;

// Reverse Number via recursive way

public class Q8_ReverseNumber {
    public static void main(String[] args) {
        int num = 1824;
        int reversed = 0;
        System.out.println(reverseNumberR(num, reversed));
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

/*

🔹 Recursive Tree (Visual)
Call: reverseNumberR(1824, 0)
└─> reverseNumberR(182, 4)         // 0*10 + 4
     └─> reverseNumberR(18, 42)    // 4*10 + 2
          └─> reverseNumberR(1, 428)  // 42*10 + 8
               └─> reverseNumberR(0, 4281) // 428*10 + 1
                     └─> Base case → return 4281
🔹 Backtracking / Return Values
reverseNumberR(0, 4281)   → returns 4281
reverseNumberR(1, 428)    → returns 4281
reverseNumberR(18, 42)    → returns 4281
reverseNumberR(182, 4)    → returns 4281
reverseNumberR(1824, 0)   → returns 4281
 */