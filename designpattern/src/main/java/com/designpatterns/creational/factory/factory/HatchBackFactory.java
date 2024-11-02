package com.designpatterns.creational.factory.factory;

import com.designpatterns.creational.factory.product.HatchBack;
import com.designpatterns.creational.factory.product.Vehicle;

public class HatchBackFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new HatchBack();
    }
}
