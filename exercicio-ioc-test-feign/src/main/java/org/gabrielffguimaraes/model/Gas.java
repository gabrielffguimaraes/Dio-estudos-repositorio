package org.gabrielffguimaraes.model;


import org.gabrielffguimaraes.exceptions.FullReservatoryException;
import org.gabrielffguimaraes.interfaces.IFuel;

public class Gas extends Fuel {
    public Gas() {
        super(5.2 ,
                "Gas" ,
                150 ,
                0 ,
                18);
    }

    public void fuelInfo() {
        System.out.println("## Gas ##");
        System.out.println("Reservatory : "+this.getReservatory());
        System.out.println("Limit : "+this.getLimit()+" m3 .");
    }
}
