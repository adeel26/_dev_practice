package com.adeel.Other_Path.Threading;

public class MyRunnable implements Runnable{

    // This code will run in background parallel to main thread.

    @Override
    public void run() {

        for (int i = 5; i <= 10 ; i++) {

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            // Exit condition
            if(i == 10) {
                System.out.println("Time's up!");
                System.exit(0); // terminates the JVM and kills ALL threads immediately
            }


        }

    }

}


/*

✅ You do NOT need a loop if you just want a thread to wait for 5 seconds
You can directly sleep for 5 seconds.

Thread.sleep(5000); // 5000 ms = 5 seconds


That’s it.

🧠 Why people sometimes use a loop?
A loop is used only when you want repeated behavior (like counting, updating UI, printing every second, etc.).

Example: print every second for 5 seconds
for (int i = 1; i <= 5; i++) {
    System.out.println(i + " second passed");
    Thread.sleep(1000);
}


Here:
The loop is for repetition
sleep(1000) is for timing

 */



/*
System.exit(0) terminates the JVM and kills ALL threads immediately
✔ main thread
✔ user threads
✔ daemon threads

Nothing keeps running.


One-line rule to remember
System.exit() = hard stop for the JVM

 */