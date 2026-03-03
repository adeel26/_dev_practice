package com.adeel.Advanced.Java8.Functional_Interface;

@FunctionalInterface
public interface Calculator {

    // Single Abstract Method (SAM) - implementation provided by the implementing class or lambda
    int operate(int x, int y);

    // Default method - provides a default implementation that can be overridden
    default void printOperation(int x, int y, int result) {
        System.out.println("Operation performed on " + x + " and " + y + ", Result: " + result);
    }

    // Static method - belongs to the interface itself, not the implementing class instance
    static void displayCalcType() {
        System.out.println("Generic Integer Calculator");
    }

}
