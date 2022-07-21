package org.gabrielffguimaraes.model;


import java.util.HashMap;
import java.util.Map;

public class FordFiesta extends Car {
    public FordFiesta(Map<String, Fuel> fuels) {
        super(fuels);
    }
    public FordFiesta() {
        super(new HashMap<String, Fuel>(){{
            put("gasoline",new Gasoline());
            put("gas",new Gas());
        }});
    }
}
