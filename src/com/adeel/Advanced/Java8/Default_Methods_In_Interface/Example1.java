package com.adeel.Advanced.Java8.Default_Methods_In_Interface;


public class Example1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();

        Parent p = new Child();
        p.sayHello();
    }
}

interface Parent {
    default void sayHello() {
        System.out.println("Hello");
    }
}

class Child implements Parent{
    @Override
    public void sayHello() {
        System.out.println("Child says Hello!");
    }
}
