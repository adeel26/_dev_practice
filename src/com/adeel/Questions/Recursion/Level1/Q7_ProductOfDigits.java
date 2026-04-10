package com.adeel.Questions.Recursion.Level1;

// Product of digits via recursion
public class Q7_ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfProducts(1345));
    }

    static int sumOfProducts (int num) {
        // Base case
        if (num == 0) {
            return 1;
        }
        // Recursive call
        return (num % 10) * sumOfProducts(num / 10);
    }
}


/*
🌳 Recursive Tree for productDigits(1234)
productDigits(1234)
= 4 * productDigits(123)

    productDigits(123)
    = 3 * productDigits(12)

        productDigits(12)
        = 2 * productDigits(1)

            productDigits(1)
            = 1 * productDigits(0)

                productDigits(0)
                = 1   ← base case


🔄 Backtracking (returns)
productDigits(0) = 1
productDigits(1) = 1 * 1 = 1
productDigits(12) = 2 * 1 = 2
productDigits(123) = 3 * 2 = 6
productDigits(1234) = 4 * 6 = 24


🧠 Key Difference from Sum
Sum → +
Product → *
Base case:
Sum → 0
Product → 1 ❗ (very important)


🔥 Pattern
f(n) = last_digit * f(n / 10)
⚡ Important Edge Case
If number contains 0:
Example: 1023 → 0 (because multiplication)

🧠 Interview Tip
If they ask why base case is 1:
Because 1 is the identity for multiplication (just like 0 is for addition)

 */