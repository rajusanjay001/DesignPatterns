package com.designpatterns.creational.factory.product;

public class HatchBack implements Vehicle {

    @Override
    public void book() {
        System.out.println("Book HatchBack called");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver HatchBack Called");
    }
}
