package org.gabrielffguimaraes.model;

import java.util.HashMap;
import java.util.Map;

public class Fusca extends Car {
    public Fusca(Map<String, Fuel> fuels) {
        super(fuels);
    }
    public Fusca() {
        super(new HashMap<String, Fuel>(){{
            put("gasoline",new Gasoline());
        }});
    }
}
