package com.workspace.br.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ConteudoStremApi2 {
    public static void main(String[] args) {
        System.out.println("IMPRIMINDO OBJETOS COM EXPRESSÃO LAMBDA E REFERENCE METHOD");
        List<String> numerosAleatorios = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8"));
        numerosAleatorios.forEach(System.out::println);

        System.out.println("PEGUE OS 5 PRIMEIROS NÚMEROS E COLOQUE DENTRO DE UM SET");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("TRANSFORME ESTA LISTA DE STRING EM UMA LISTA DE NUMEROS DE INTEIROS");
        numerosAleatorios.stream()
                .map(n -> (Integer.parseInt(n) + Integer.parseInt(n)))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("PEGUE OS NÚMEROS PARES E MAIORES Q 2 E COLOQUE EM UMA LISTA");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0 && n > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("MOSTRAR MÉDIA DOS NUMEROS");
        numerosAleatorios.stream()
                .map(Double::parseDouble)
                .reduce((acumulator , n) -> acumulator + n)
                .map(tot -> (tot / numerosAleatorios.size()))
                .ifPresent(System.out::println);


        System.out.println("MOSTRAR MÉDIA DOS NUMEROS");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("REMOVER NUMEROS IMPARES");
        numerosAleatorios.removeIf(i -> (Integer.parseInt(i) % 2 != 0));

        System.out.println(numerosAleatorios);
    }
}
