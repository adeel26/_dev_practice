package com.adeel.Advanced.Java8.Lambda_Expression.Usage2.Before;

public class MyClass implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + i);
        }
    }
}
