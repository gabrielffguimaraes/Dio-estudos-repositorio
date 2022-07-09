package com.workspace.br.exercicios;

import com.workspace.br.classes.Gato;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LancamentoDeDados {
    public static void main(String[] args) {
        System.out.println("** Programa para fazer o lançamento dos dados **");
        Scanner scan = new Scanner(System.in);
        Map<Integer,Integer> lancamentos = new HashMap<>();
        Map<Integer,Integer> lancamentosContador = new HashMap<>();
        int i = 1;
        do {
            i++;
            System.out.println("Próximo lançamento : ");
            Integer entry = scan.nextInt();
            lancamentos.put(i,entry);
            System.out.println(i + " de 10 .");

            /*armazenando numero de repetições de cada lançamento*/
            if (!lancamentosContador.containsKey(entry)) {
                lancamentosContador.put(entry,1);
            } else {
                int next = lancamentosContador.get(entry) + 1;
                lancamentosContador.put(entry,next);
            }
        } while (i <= 10);
        System.out.println("Lançamentos :");
        System.out.println(lancamentos);

        System.out.println("Lançamentos repetidos :");
        System.out.println(lancamentosContador);

        System.out.println("Map com chave sendo objeto");
        Map<Gato,Boolean> gatos = new HashMap<>(){{
            put(new Gato("Carlos",25,"preto"),false);
            put(new Gato("Estrela",8,"azul"),true);
        }};
        /* obs para realizar a busca por objeto como chave é necessário que a classe implemente o equals */
        System.out.println(gatos.get(new Gato("Carlos",25,"preto")));

    }
}
