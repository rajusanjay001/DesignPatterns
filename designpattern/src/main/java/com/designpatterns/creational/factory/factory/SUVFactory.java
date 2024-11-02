package com.designpatterns.creational.factory.factory;

import com.designpatterns.creational.factory.product.SUV;
import com.designpatterns.creational.factory.product.Vehicle;

public class SUVFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new SUV();
    }
}

