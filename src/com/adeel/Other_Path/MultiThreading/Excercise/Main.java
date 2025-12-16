package com.adeel.Other_Path.MultiThreading.Excercise;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyRunnable("Earth"));
        Thread thread2 = new Thread(new MyRunnable("Mars"));

        System.out.println("Session Start");

        thread1.start();
        thread2.start();

        try {
            thread1.join();     // main thread waits until thread1 finishes
            thread2.join();     // main thread waits until thread2 finishes
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");;
        }

        System.out.println("Session End");

    }
}
