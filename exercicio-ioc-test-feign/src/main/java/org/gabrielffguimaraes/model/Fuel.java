package org.gabrielffguimaraes.model;

import org.gabrielffguimaraes.exceptions.FullReservatoryException;
import org.gabrielffguimaraes.interfaces.IFuel;

abstract public class Fuel implements IFuel {
    /**
     * actual price in brazil 2022
     */
    private double price;
    private String description;
    private int availablePlaces;

    /**
     * reservatory
     */
    private double reservatory;

    /**
     * limit supported in reservatory
     */
    private double limit;

    public Fuel(double price, String description, int availablePlaces, double reservatory, double limit) {
        this.price = price;
        this.description = description;
        this.availablePlaces = availablePlaces;
        this.reservatory = reservatory;
        this.limit = limit;
    }

    public boolean fill(double money) throws FullReservatoryException {
        double fuel = money / this.price;
        this.reservatory += fuel;
        if(this.reservatory > this.limit) {
            this.reservatory = this.limit;
            throw new FullReservatoryException("reservatory is in limit .");
        };
        return true;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailablePlaces() {
        return availablePlaces;
    }

    public void setAvailablePlaces(int availablePlaces) {
        this.availablePlaces = availablePlaces;
    }

    public double getReservatory() {
        return reservatory;
    }

    public void setReservatory(double reservatory) {
        this.reservatory = reservatory;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", availablePlaces=" + availablePlaces +
                ", reservatory=" + reservatory +
                ", limit=" + limit +
                '}';
    }
}
