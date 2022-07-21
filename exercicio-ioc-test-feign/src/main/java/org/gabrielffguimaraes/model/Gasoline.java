package org.gabrielffguimaraes.model;

import org.gabrielffguimaraes.exceptions.FullReservatoryException;
import org.gabrielffguimaraes.interfaces.IFuel;

public class Gasoline extends Fuel {
    public Gasoline() {
        super(8 ,
 "Gasoline" ,
      350 ,
           0 ,
               70);
    }

    public void fuelInfo() {
        System.out.println("## Gasoline ##");
        System.out.println("Reservatory : "+this.getReservatory());
        System.out.println("Limit : "+this.getLimit()+" liters .");
    }
}
