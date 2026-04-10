package com.adeel.Questions.Recursion.Level1;

// N to 1
public class Q1_Nto1 {
    public static void main(String[] args) {
        func(5);
    }

    static void func(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        func(n - 1);
    }
}
