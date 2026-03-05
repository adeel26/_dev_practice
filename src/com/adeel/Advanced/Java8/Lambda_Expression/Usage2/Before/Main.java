package com.adeel.Advanced.Java8.Lambda_Expression.Usage2.Before;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread childThread = new Thread(myClass);
        childThread.run();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Bye " + i);
        }
    }
}
