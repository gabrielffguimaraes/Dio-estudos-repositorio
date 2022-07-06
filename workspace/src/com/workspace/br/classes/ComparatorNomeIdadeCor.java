package com.workspace.br.classes;

import java.util.Comparator;

public class ComparatorNomeIdadeCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareTo(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getIdade().compareTo(g2.getIdade());
        if(cor != 0) return cor;

        return g1.getCor().compareTo(g1.getCor());
    }
}
