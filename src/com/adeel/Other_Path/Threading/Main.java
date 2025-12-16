package com.adeel.Other_Path.Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Threading = Allows a program to run multiple tasks simultaneously
        //              Helps improve performance with time-consuming operations
        //              (File I/O, network communications, or any background tasks)

        //  How to create a Thread
        //  Option 1. Extend the Thread class (simpler)
        //  Option 2. Implement the Runnable interface (better)

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // A daemon thread ends when all non-daemon (user) threads end
        thread.start();


        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);



        scanner.close();

    }
}

/*

🧵 Is code in main() running as a thread?
✅ YES.
The main() method already runs in a thread called:

main thread

When your Java program starts, the JVM automatically creates one thread and runs main() inside it.


🧠 So what happens when you add thread code in main()?

Case 1️⃣ Normal code in main()
System.out.println("A");
System.out.println("B");

This runs sequentially in the main thread.


Case 2️⃣ You create a new thread
Thread t = new Thread(() -> {
    System.out.println("Thread running");
});
t.start();

System.out.println("Main continues");


Now you have:
Main thread → continues executing
New thread (t) → runs in parallel
They run at the same time (concurrently).


❌ Important mistake to avoid
Calling run() directly:
t.run(); // ❌ NOT a new thread

This runs inside the main thread, not concurrently.

Always use:
t.start(); // ✅ creates a new thread

🧠 One-line memory rule
main() itself is a thread
start() creates a new thread
run() is just a normal method
 */


//------------------------------------------------------------------

/*
A daemon thread ends when all non-daemon (user) threads end,
not just when the main thread ends.

Why this matters
main thread is a user thread
If main ends AND no other user threads are running → JVM exits
When JVM exits → all daemon threads are stopped immediately

Scenarios

✅ Case 1: Only main + daemon thread
main (user)  ❌ ends
daemon       ❌ ends (JVM exits)

✔ Yes — daemon stops when main ends


❌ Case 2: main + another user thread + daemon
main (user)   ❌ ends
worker (user) ✔ running
daemon        ✔ keeps running

✔ Daemon continues because a user thread still exists


Simple rule to remember
JVM lives as long as at least ONE user thread is alive

Daemon threads cannot keep JVM alive

 */