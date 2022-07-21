package org.gabrielffguimaraes;

import org.gabrielffguimaraes.exceptions.FullReservatoryException;
import org.gabrielffguimaraes.interfaces.ICar;
import org.gabrielffguimaraes.model.*;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car bumblebee = new FordFiesta();
        Fuel etanol = new Gas();
        try {
            bumblebee.getFuels().get("gas").fill(80);
            bumblebee.getFuels().get("gas").fuelInfo();
        } catch (FullReservatoryException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
