package com.adeel.Questions.Recursion.Level1;

// Sum of N numbers via Recursion
public class Q5_Sum_Of_N_Numbers {
    public static void main(String[] args) {
        System.out.println(sumN(5));
    }

    static int sumN(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumN(n-1);
    }
}

/*
Going DOWN
sumN(4)
= 4 + sumN(3)
= 4 + 3 + sumN(2)
= 4 + 3 + 2 + sumN(1)
= 4 + 3 + 2 + 1 + sumN(0)

Coming BACK
sumN(0) = 0

sumN(1) = 1 + 0 = 1
sumN(2) = 2 + 1 = 3
sumN(3) = 3 + 3 = 6
sumN(4) = 4 + 6 = 10


Key Insight
Work happens while coming back (unwinding)
Same pattern as factorial, just using + instead of *

 */


/*
🌳 Recursion Tree for sumN(4)
🧠 Tree Structure (actual calls)
sumN(4)
│
└── 4 + sumN(3)
        │
        └── 3 + sumN(2)
                │
                └── 2 + sumN(1)
                        │
                        └── 1 + sumN(0)
                                │
                                └── 0   (base case)
⬇️ Going DOWN (calls building)
sumN(4)
→ 4 + sumN(3)

sumN(3)
→ 3 + sumN(2)

sumN(2)
→ 2 + sumN(1)

sumN(1)
→ 1 + sumN(0)

sumN(0)
→ 0
⬆️ Coming BACK (calculation happens here)
sumN(0) = 0

sumN(1) = 1 + 0 = 1
sumN(2) = 2 + 1 = 3
sumN(3) = 3 + 3 = 6
sumN(4) = 4 + 6 = 10
🎯 Final Answer
sumN(4) = 10
🔥 Key Understanding
This is a linear recursion tree (chain)
Not branching (unlike Fibonacci)
All real work happens while returning (unwinding)
 */