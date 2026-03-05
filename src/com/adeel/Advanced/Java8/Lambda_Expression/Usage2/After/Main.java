package com.adeel.Advanced.Java8.Lambda_Expression.Usage2.After;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hi " + i);
            }
        };

        Thread childThread = new Thread(runnable);
        childThread.run();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Bye " + i);
        }
    
    }
}
