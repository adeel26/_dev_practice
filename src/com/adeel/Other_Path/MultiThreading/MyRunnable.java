package com.adeel.Other_Path.MultiThreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }


        }


    }

}
