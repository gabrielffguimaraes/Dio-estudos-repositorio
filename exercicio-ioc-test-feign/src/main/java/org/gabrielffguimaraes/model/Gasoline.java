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

    public String fuelInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append("## Gasoline ## |");
        sb.append(String.format(" Reservatory : %.2f",this.getReservatory()));
        sb.append(" Limit : "+this.getLimit()+" liters .");

        return sb.toString();
    }
}
