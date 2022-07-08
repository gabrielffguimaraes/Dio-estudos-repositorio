package com.workspace.br.classes;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPaginas implements Comparator<Map.Entry<String,Livros>> {

    @Override
    public int compare(Map.Entry<String, Livros> c1, Map.Entry<String, Livros> c2) {
        return c1.getValue().getPaginas().compareTo(c2.getValue().getPaginas());
    }
}
