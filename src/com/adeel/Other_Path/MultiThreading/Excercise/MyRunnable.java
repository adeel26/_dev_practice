package com.adeel.Other_Path.MultiThreading.Excercise;

public class MyRunnable implements Runnable{

    private final String text;

    public MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(this.text + " " + i);
            }catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }


        }

    }

}
