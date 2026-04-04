package com.adeel.Questions.Recursion.Level1;

// Recursive factorial function
public class Q_R_Lvl1_4 {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
    }

    static int factorialRecursive (int n){
        // Base case
        if(n <= 1){
            return 1;
        }
        // Recursive call
        return n * factorialRecursive(n-1);
    }
    
}



/*
How recursion works (quick idea)
factorial(5)
= 5 * factorial(4)
= 5 * 4 * factorial(3)
= 5 * 4 * 3 * factorial(2)
= 5 * 4 * 3 * 2 * factorial(1)
= 5 * 4 * 3 * 2 * 1
= 120


Actual Tree Structure
factorial(4)
│
└── 4 * factorial(3)
        │
        └── 3 * factorial(2)
                │
                └── 2 * factorial(1)
                        │
                        └── 1   (base case)


Going DOWN (calls)
factorial(4)
→ 4 * factorial(3)

factorial(3)
→ 3 * factorial(2)

factorial(2)
→ 2 * factorial(1)

factorial(1)
→ 1 (base case)


Coming BACK (multiplication happens here)
factorial(1) = 1

factorial(2) = 2 * 1 = 2

factorial(3) = 3 * 2 = 6

factorial(4) = 4 * 6 = 24


Key Insight (VERY important)
This is a linear recursion tree (like a chain)
Not branching like Fibonacci
Work happens while coming back (unwinding)

 */