package com.workspace.br.arrays;

import java.util.*;

public class ConteudoSets {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione notas");


        Set<Double> notas = new HashSet<Double>(new ArrayList<Double>() {
            {   add(8d);
                add(4d);
                add(2d);
                add(15d);
                add(78d);
            }
        });

        System.out.println("Posição da nota 5 (não é possivel resgatar posição no array set)");

        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        System.out.println(notas);

        Double soma = 0.0;
        for(Number nota:notas) {
            soma += nota.doubleValue();
        }
        System.out.println("Exiba a soma dos valores :"+soma);

        System.out.println("Exiba a média :"+soma / notas.size());

        System.out.println("Remova a nota 2");
        notas.remove(2);

        System.out.println(notas);

        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()) {
            Double next = iterator.next();
            if(next < 7) {
                iterator.remove();
            }
        }
        System.out.println(notas);

    }
}
