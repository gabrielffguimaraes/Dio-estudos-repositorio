package org.tests;

import junit.framework.TestCase;
import org.tests.controller.TestController;


public class TestUnitController extends TestCase {
    public void testUnit() {
        TestController testController = new TestController();
        String resultado = testController.saudacao("DIO");
        assertTrue(resultado.indexOf("DIO") > -1);
    }
    public void testSoma() {
        TestController testController = new TestController();
        Double resultado = testController.soma(5d,9d);
        assertEquals(resultado,14.0);
    }
}
