package org.gabrielffguimaraes;


import junit.framework.TestCase;
import org.gabrielffguimaraes.model.*;

public class TestFuel extends TestCase {
    /**
     * Testando
     */
    public void test1() {
        Car carro1 = new FordFiesta();
        carro1.getFuels().get("gasoline").fill(50);
        double price = carro1.getFuels().get("gasoline").getPrice() * carro1.getFuels().get("gasoline").getReservatory();
        assertEquals(price,50d);
    }
}
