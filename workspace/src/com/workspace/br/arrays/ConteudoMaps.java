package com.workspace.br.arrays;

import java.util.*;

public class ConteudoMaps {
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

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Consumo do uno :" + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos : ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(List.of(modelos));

        System.out.println("Exiba os valores : ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        /* Primeira solução */
        System.out.println("Exiba o modelo de menor consumo : ");
        Double[] menorConsumo = {Collections.min(carrosPopulares.values())};
        Double[] maiorConsumo = {Collections.max(carrosPopulares.values())};
        String[] carroMenorConsumo = {""};
        String[] carroMaiorConsumo = {""};
        carrosPopulares.entrySet().forEach(carro -> {
            if (carro.getValue().equals(menorConsumo[0])) {
                carroMenorConsumo[0] = carro.getKey();
            }
            if (carro.getValue().equals(maiorConsumo[0])) {
                carroMaiorConsumo[0] = carro.getKey();
            }
        });
        System.out.println("Carro de menor consumo atualmente e : "+carroMenorConsumo[0]+" consumo : "+menorConsumo[0]);
        System.out.println("Carro de maior consumo atualmente e : "+carroMaiorConsumo[0]+" consumo : "+maiorConsumo[0]);
        Iterator<Double> iterator  = carrosPopulares.values().iterator() ;
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Soma dos consumos é : "+soma);

        System.out.println("A Média do consumo é de : "+soma/carrosPopulares.size());

        System.out.println("Exibir os carros na ordem de inserção");
        Map<String, Double> carrosPopularesOI = new LinkedHashMap<>(){{
            put("gol",14.2);
            put("uno",15.2);
            put("mobi",16.2);
            put("hb20",14.2);
            put("kwid",15.6);
            put("tucson",15.6);
        }};
        System.out.println(carrosPopularesOI);

        System.out.println("Confira se o dicionario está vazio : ");
        Map<String ,Double> carrosPopularesTree = new TreeMap<>(carrosPopulares);
        carrosPopularesTree.clear();
        System.out.println(carrosPopularesTree.isEmpty());


    }
}
