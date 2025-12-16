package com.adeel.Other_Path.MultiThreading;

public class Main {
    public static void main(String[] args) {

        //  Multithreading = Enables a program to run multiple threads concurrently
        //                   (Thread = A set of instructions that run independently)
        //                   Useful for background tasks or time-consuming operations


       Thread thread1 = new Thread(new MyRunnable());
       Thread thread2 = new Thread(new MyRunnable());

       thread1.start();
       thread2.start();



    }
}
