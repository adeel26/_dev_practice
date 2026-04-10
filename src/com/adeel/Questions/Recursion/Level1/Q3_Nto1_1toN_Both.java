package com.adeel.Questions.Recursion.Level1;

public class Q3_Nto1_1toN_Both {
    public static void main(String[] args) {
        funcBoth(5);
    }
    static void funcBoth (int n) {
        // Base case: stop recursion when n becomes 0
        if(n == 0){
            return;
        }
        // =========================
        // BEFORE recursive call (GOING DOWN the stack)
        // =========================
        // This prints while function calls are being ADDED to stack

        // Example flow if funcBoth(3):
        // funcBoth(3) -> print 3
        // funcBoth(2) -> print 2
        // funcBoth(1) -> print 1
        System.out.println(n);

        // Recursive call: function calls itself with n-1
        // (going deeper into stack)
        funcBoth(n-1);

        // =========================
        // AFTER recursive call (COMING BACK / UNWINDING stack)
        // =========================
        // This prints while function calls are being REMOVED from stack

        // Reverse flow:
        // funcBoth(1) resumes -> print 1
        // funcBoth(2) resumes -> print 2
        // funcBoth(3) resumes -> print 3

        System.out.println(n);
    }
}

/*
Actual Tree for funcBoth(3)

funcBoth(3)
├── print 3   (before call)
└── funcBoth(2)
    ├── print 2
    └── funcBoth(1)
        ├── print 1
        └── funcBoth(0)
            └── return
        └── print 1   (after call)
    └── print 2
└── print 3


Step-by-step execution
⬇️ Going DOWN (stack building)
funcBoth(3) → print 3
funcBoth(2) → print 2
funcBoth(1) → print 1
funcBoth(0) → return
⬆️ Coming BACK (stack unwinding)
funcBoth(1) resumes → print 1
funcBoth(2) resumes → print 2
funcBoth(3) resumes → print 3
🎯 Final Output
3 2 1 1 2 3
 */


/*
STACK visualization
⬇️ Going DOWN (calls)
Call funcBoth(3)
Stack:
[ funcBoth(3) ]

Call funcBoth(2)
Stack:
[ funcBoth(3)
  funcBoth(2) ]

Call funcBoth(1)
Stack:
[ funcBoth(3)
  funcBoth(2)
  funcBoth(1) ]

Call funcBoth(0)
Stack:
[ funcBoth(3)
  funcBoth(2)
  funcBoth(1)
  funcBoth(0) ]
→ returns immediately



Coming BACK (unwinding)
funcBoth(0) returns

Back to funcBoth(1)
→ executes: System.out.println(1)
Stack:
[ funcBoth(3)
  funcBoth(2)
  funcBoth(1) ]
→ pop funcBoth(1)

Back to funcBoth(2)
→ executes: System.out.println(2)
Stack:
[ funcBoth(3)
  funcBoth(2) ]
→ pop funcBoth(2)

Back to funcBoth(3)
→ executes: System.out.println(3)
Stack:
[ funcBoth(3) ]
→ pop funcBoth(3)
 */