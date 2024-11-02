package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.factory.SUVFactory;
import com.designpatterns.creational.factory.product.Vehicle;
import com.designpatterns.creational.factory.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory suvFactory = new SUVFactory();
        Vehicle suv = suvFactory.createVehicle();
        suv.book();
        suv.deliver();
    }
}
