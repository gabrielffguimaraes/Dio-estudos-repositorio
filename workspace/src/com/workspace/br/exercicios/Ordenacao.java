package com.workspace.br.exercicios;

import com.workspace.br.classes.ComparatorAnoNome;
import com.workspace.br.classes.ComparatorIde;
import com.workspace.br.classes.ComparatorNomeAnoIDE;
import com.workspace.br.classes.LinguagemFavorita;

import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {
        /*Crie uma classe linguagem favorita que possua os attributos nome
        * anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens e faça um
        * programa que ordene esse conjunto por : */
        Set<LinguagemFavorita> linguagensFavoritas = new HashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("Java",2011,"Intellij"));
            add(new LinguagemFavorita("Java",2024,"Intellij"));
            add(new LinguagemFavorita("Java",2013,"Intellij"));
            add(new LinguagemFavorita("Java",2020,"Intellij"));
            add(new LinguagemFavorita("Php",2015,"PhpStorm"));
            add(new LinguagemFavorita("Javascript",2005,"WebStorm"));
            add(new LinguagemFavorita("C",2005,"Visual Studio Code"));
        }};
        System.out.println("Ordem de inserção");

        Set<LinguagemFavorita> linguagensOrdemInsert = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",2013,"Intellij"));
            add(new LinguagemFavorita("Php",2015,"PhpStorm"));
            add(new LinguagemFavorita("Javascript",2005,"WebStorm"));
            add(new LinguagemFavorita("C",2005,"Visual Studio Code"));}};
        System.out.println(linguagensOrdemInsert);
        System.out.println("Ordem de natural (nome)");
        Set<LinguagemFavorita> linguagensOrdemNatural = new TreeSet<>(linguagensFavoritas);
        System.out.println(linguagensOrdemNatural);

        System.out.println("Ordem de IDE (IDE)");
        Set<LinguagemFavorita> linguagensOrdemIde = new TreeSet<>(new ComparatorIde()){{addAll(linguagensFavoritas);}};

        System.out.println("Ordem de Ano e Nome (ano,nome)");
        List<LinguagemFavorita> linguagensAnoNome = new ArrayList<LinguagemFavorita>(linguagensFavoritas);
        Collections.sort(linguagensAnoNome,new ComparatorAnoNome());
        System.out.println(linguagensAnoNome);

        System.out.println("Ordem de Nome Ano IDE(nome,nome,ide)");
        List<LinguagemFavorita> linguagensNomeAnoIDE = new ArrayList<LinguagemFavorita>(linguagensFavoritas);
        Collections.sort(linguagensNomeAnoIDE,new ComparatorNomeAnoIDE());
        System.out.println(linguagensNomeAnoIDE);
    }
}
