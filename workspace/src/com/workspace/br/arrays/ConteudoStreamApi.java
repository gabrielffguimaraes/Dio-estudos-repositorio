package com.workspace.br.arrays;

import java.util.*;
import java.util.function.Function;

public class ConteudoStreamApi {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.2);
            put("uno",15.2);
            put("mobi",16.2);
            put("hb20",14.2);
            put("kwid",15.6);
            put("tucson",15.6);
        }};
        System.out.println(carrosPopulares.toString());
        carrosPopulares.put("gol",50.0);
        System.out.println(carrosPopulares);

        System.out.println("Comparação por nome (USANDO CLASSE ANONIMA)");
        Set<Map.Entry<String,Double>> carros =  new TreeSet<>(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> m1, Map.Entry<String, Double> m2) {
                return m1.getKey().compareToIgnoreCase(m2.getKey());
            }
        });
        carros.addAll(carrosPopulares.entrySet());
        System.out.println(carros);


        System.out.println("Comparação por valores (USANDO FUNCTIONS)");
        Set<Map.Entry<String,Double>> carros2 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<String, Double>, Double>() {
                    @Override
                    public Double apply(Map.Entry<String, Double> carro) {
                         return carro.getValue();
                    }
                }
        ));
        carros2.addAll(carros);
        System.out.println(carros2);

        System.out.println("Comparação por valores (USANDO LAMBDA)");
        Set<Map.Entry<String,Double>> carros3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue()));
        carros3.addAll(carros);
        System.out.println(carros3);

    }
}
