package org.gabrielffguimaraes;

import org.gabrielffguimaraes.exceptions.FullReservatoryException;
import org.gabrielffguimaraes.model.Car;
import org.gabrielffguimaraes.model.Fuel;
import org.gabrielffguimaraes.model.Gas;
import org.gabrielffguimaraes.model.Gasoline;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fuel gas = new Gas();
        Car bumblebee = new Car(gas);
        try {
            bumblebee.getFuel().fill(25.50);
            bumblebee.getFuel().fuelInfo();
        } catch (FullReservatoryException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
