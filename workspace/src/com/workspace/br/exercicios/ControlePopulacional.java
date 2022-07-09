package com.workspace.br.exercicios;

import com.workspace.br.classes.ComparatorEstadoPopulacao;

import java.util.*;

public class ControlePopulacional {
    public static void main(String[] args) {
        System.out.println("Dada a população e alguns estados brasileiros faça");

        Map<String,Double> populacao = new HashMap<>(){{
            put("PE",9616.621);
            put("AL",3351.543);
            put("CE",9187.103);
            put("RN",3534.265);
        }};

        populacao.put("RN",3534.165);
        System.out.println(populacao);

        System.out.println("O estádo de PB está no dicionário ? ");
        Boolean isPresent = populacao.containsKey("PB");
        System.out.println(isPresent);

        if(!isPresent) {
            populacao.put("PB",4039.277);
        }
        System.out.println("População atual :");
        System.out.println(populacao);

        System.out.println("População ordenada por inserção");
        Map<String,Double> populacaoOI = new LinkedHashMap<>(){{
            put("PE",9616.621);
            put("AL",3351.543);
            put("CE",9187.103);
            put("RN",3534.265);
        }};
        System.out.println(populacaoOI);

        System.out.println("Populacao ordenada apenas estado ");
        Map<String,Double> populacaoEP = new TreeMap<>(populacao);
        System.out.println(populacaoEP);

        System.out.println("Populacao ordenada por estado e numero de habitantes");
        /*obs para ordenar um treemap com comparator é necessário utilizar o Set como auxiliar*/

        //alternativa 1 utilizando o treeSet para ordenaçao passando o comparator no construtor
        Set<Map.Entry<String,Double>> auxSetOrder = new TreeSet(new ComparatorEstadoPopulacao());
        auxSetOrder.addAll(populacao.entrySet());

        //alternativa 2 utilizando o arrayList para ordenaçao
        //extraindo um set do treeMap e convertendo o set resultante em um arrayList
        List<Map.Entry<String,Double>> auxListOrder = new ArrayList<>(populacao.entrySet());
        Collections.sort(auxListOrder,new ComparatorEstadoPopulacao());

        System.out.println(auxListOrder);

        double max = Collections.max(populacao.values());
        double min = Collections.min(populacao.values());
        for (Map.Entry<String,Double> estado : populacao.entrySet()) {
            Double n = estado.getValue();
            if (n.equals(min)) {
                System.out.println("Estado com a menor população é o estado de(a) : " + estado.getKey());
            }
            if (n.equals(max)) {
                System.out.println("Estado com a maior população é o estado de(a) : " + estado.getKey());
            }
        }

        double[] soma = {0};
        populacao.forEach((key,value) -> {
            soma[0] += value;
        });
        System.out.println("Numero total da populaçao de todos os estados combinados: " + soma[0]);
        System.out.println("A média da população dos estados é : " + soma[0] / populacao.size());

        System.out.println("Remover estados com população menor que 4000");
        Iterator<Map.Entry<String,Double>> iterator = populacao.entrySet().iterator();
        while(iterator.hasNext()) {
            if (iterator.next().getValue() < 4000) {
                iterator.remove();
            }
        }

        System.out.println("Apagar estados");
        populacao.clear();

        System.out.println("Possui estados ?");
        System.out.println(populacao.isEmpty());

    }
}
