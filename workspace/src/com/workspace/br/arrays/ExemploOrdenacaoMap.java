package com.workspace.br.arrays;

import com.workspace.br.classes.ComparatorNomeLivro;
import com.workspace.br.classes.ComparatorPaginas;
import com.workspace.br.classes.Livros;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Map<String, Livros> meusLivros = new HashMap<>(){{
            put("Autor 11" , new Livros("amoeba",200));
            put("Robert" , new Livros("o poder do habito",2005));
            put("21 Lições para século 21" , new Livros("21 lições para o século 21",250));
        }};
        for (Map.Entry<String,Livros> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey());
            System.out.println(livro);
        }
        System.out.println("Ordem de inserção");
        Map<String, Livros> meusLivrosOI = new LinkedHashMap<>(){{
            put("Autor 11" , new Livros("amoeba",200));
            put("Robert" , new Livros("o poder do habito",200));
            put("21 Lições para século 21" , new Livros("21 lições para o século 21",200));
        }};
        for (Map.Entry<String,Livros> livro : meusLivrosOI.entrySet()) {
            System.out.println(livro.getKey());
            System.out.println(livro);
        }

        System.out.println("Ordem alfabética autores");
        Map<String, Livros> meusLivrosOA = new TreeMap<>(){{
            put("Autor 11" , new Livros("amoeba",200));
            put("Robert" , new Livros("o poder do habito",200));
            put("21 Lições para século 21" , new Livros("21 lições para o século 21",200));
        }};
        for (Map.Entry<String,Livros> livro : meusLivrosOA.entrySet()) {
            System.out.println(livro.getKey());
            System.out.println(livro);
        }

        System.out.println("Ordem alfabética nomes e livros");
        Set<Map.Entry<String,Livros>> meusLivrosONL = new TreeSet<>(new ComparatorNomeLivro());
        meusLivrosONL.addAll(meusLivros.entrySet());
        System.out.println(meusLivrosONL);

        System.out.println("Ordem alfabética paginação");
        Set<Map.Entry<String,Livros>> meusLivrosOP = new TreeSet<>(new ComparatorPaginas());
        meusLivrosOP.addAll(meusLivros.entrySet());
        System.out.println(meusLivrosOP);
    }
}
