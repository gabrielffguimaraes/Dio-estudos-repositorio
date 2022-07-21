package org.gabrielffguimaraes.model;

import org.gabrielffguimaraes.interfaces.ICar;

import java.util.Map;

public class Car implements ICar {
    public Car(Map<String, Fuel> fuels) {
        this.fuels = fuels;
    }

    Map<String, Fuel> fuels;

    public Map<String, Fuel> getFuels() {
        return fuels;
    }

    public void setFuels(Map<String, Fuel> fuels) {
        this.fuels = fuels;
    }
}
