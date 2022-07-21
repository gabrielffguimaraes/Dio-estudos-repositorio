package org.gabrielffguimaraes.model;

import org.gabrielffguimaraes.interfaces.IFuel;

public class Car {
    private Fuel fuel;

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Car(Fuel fuel) {
        this.fuel = fuel;
    }
}
