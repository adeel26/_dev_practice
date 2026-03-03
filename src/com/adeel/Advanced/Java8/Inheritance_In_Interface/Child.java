package com.adeel.Advanced.Java8.Inheritance_In_Interface;

@FunctionalInterface
public interface Child extends Parent{
    public void sayHello();

    default void sayBye() {

    }
}

/*
Child will be functional interface if it doesn't contain new abstract method.
It can contain same abstract method which is in parent interface.

 */