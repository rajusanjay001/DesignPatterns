package com.designpatterns.creational.factory.product;

public class SUV implements Vehicle {
    @Override
    public void book() {
        System.out.println("Book SUV called");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver SUV called");
    }
}
