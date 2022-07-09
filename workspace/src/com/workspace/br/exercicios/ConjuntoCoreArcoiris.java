package com.workspace.br.exercicios;

import com.workspace.br.classes.ComparatorInverse;

import java.util.*;

public class ConjuntoCoreArcoiris {
    public static void main(String[] args) {
        System.out.println("Crie um conjunco contendo as cores do arco-iris :");
        Set<String> arcoiris = new LinkedHashSet<>(new ArrayList<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("anill");
            add("violeta");
        }});
        System.out.println(arcoiris);

        System.out.println("Quantidade de cores do arco-iris :");
        System.out.println(arcoiris.size());

        Set<String> arcoirisOrdemAlfabetica = new TreeSet<String>(arcoiris);

        System.out.println("Arco-iris em ordem alfabética :");
        System.out.println(arcoirisOrdemAlfabetica);

        System.out.println("Arco-iris em ordem inversa :");
        List arcoirisReversed = new ArrayList<>(arcoiris);
        Collections.reverse(arcoirisReversed);
        System.out.println(arcoirisReversed);

        System.out.println("Remover cores que não começam com a letra V :");
        Iterator<String> i = arcoiris.iterator();
        while(i.hasNext()) {
            String cor = i.next();
            if(!cor.startsWith("v")) i.remove();
        }
        System.out.println(arcoiris);

        System.out.println("Limpe o conjunto :");
        arcoiris.clear();

        System.out.println("Conferir se está limpo :");
        System.out.println(arcoiris.isEmpty());

    }
}
