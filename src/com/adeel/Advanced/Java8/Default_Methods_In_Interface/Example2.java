package com.adeel.Advanced.Java8.Default_Methods_In_Interface;

public class Example2 implements A, B{
    public static void main(String[] args) {
        Example2 ex2 = new Example2();
        ex2.sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}

interface A {
    default void sayHello () {
        System.out.println("A says Hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says Hello");
    }
}
