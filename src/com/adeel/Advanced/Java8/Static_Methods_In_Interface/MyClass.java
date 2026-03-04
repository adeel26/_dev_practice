package com.adeel.Advanced.Java8.Static_Methods_In_Interface;

public class MyClass {
    public static void main(String[] args) {
        // Accessing static method of interface
        A.sayHello();

        // Accessing static method of class // Allowed in same class like this
        sayHello();
        // Accessing static method of class // Allowed outside class like this
        MyClass.sayHello();
    }
    // This static method is of class and we can't override static method
    static void sayHello() {
        System.out.println("Static from Class MyClass");
    }

}


interface A {
    // This static method belongs to only this interface
    static void sayHello() {
        System.out.println("Static from interface A");
    }
}