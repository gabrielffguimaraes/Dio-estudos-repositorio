package com.workspace.br.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CriminosoOuInocente {
    public static void main(String[] args) {
        System.out.println("Agora iremos te interrogar sobre um caso que ocorreu  aqui na grande São paulo . \n" +
                "Por favor responda com seriedade e atençao a todas as perguntas : SIM OU NÃO ");
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.nextLine();
            n += (resposta.equalsIgnoreCase("sim")) ? 1 : 0;
        }
        String resposta = "";
        switch (n) {
            case 2:
                resposta  = "Suspeita(o) .";
                break;
            case 3:
                resposta  = "Cúmplice .";
                break;
            case 4:
                resposta  = "Cúmplice .";
                break;
            case 5:
                resposta  = "Assassina(o) .";
                break;
            default:
                resposta = "Inocente .";
        }
        System.out.println("Nós da delegacia justiceiros , determinamos que você é "+resposta);
    }
    final static List<String> perguntas = Arrays.asList(
            "Telefonou para a vítima ?",
            "Esteve no local do crime ?",
            "Mora perto da vítima ?",
            "Devia para a vítima ?",
            "Já trabalhou com a vítima ?"
    );
}
