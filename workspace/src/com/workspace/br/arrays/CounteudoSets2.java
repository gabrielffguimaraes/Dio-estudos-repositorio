package com.workspace.br.arrays;

import com.workspace.br.T;
import com.workspace.br.classes.Serie;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CounteudoSets2 {
    public static void main(String[] args) {
        System.out.println("Ordenação com metodo HashSet : ordem aleatória");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show","comedia",25));
        }};
        System.out.println(series.toString());

        System.out.println("Ordenação com metodo HashSet : ordem de inserção");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",61));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show","comedia",25));
        }};
        System.out.println(series2.toString());

        System.out.println("Ordenação com metodo HashSet : ordem natural dos elementos");
        Set<Serie> series3 = new TreeSet<>(series2);

        System.out.println(series3.toString());
    }
}
