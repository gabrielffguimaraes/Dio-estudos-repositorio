package com.workspace.br.classes;

import java.util.Comparator;
import java.util.Map;

public class ComparatorEstadoPopulacao implements Comparator<Map.Entry<String,Double>> {

    @Override
    public int compare(Map.Entry<String, Double> m1, Map.Entry<String, Double> m2) {
        int estado = m1.getKey().compareTo(m2.getKey());
        if(estado != 0) return estado;

        return m1.getValue().compareTo(m2.getValue());
    }
}
