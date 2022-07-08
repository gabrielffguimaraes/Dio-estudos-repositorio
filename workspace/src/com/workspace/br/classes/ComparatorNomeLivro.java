package com.workspace.br.classes;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNomeLivro implements Comparator<Map.Entry<String,Livros>> {
    @Override
    public int compare(Map.Entry<String, Livros> m1, Map.Entry<String, Livros> m2) {
        int nome = m1.getKey().compareToIgnoreCase(m2.getKey());
        if (nome != 0) return nome;

        return m1.getValue().getNome().compareToIgnoreCase(m2.getValue().getNome());

    }
}
