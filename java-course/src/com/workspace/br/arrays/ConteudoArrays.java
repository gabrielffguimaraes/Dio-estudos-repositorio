package com.workspace.br.arrays;

import com.workspace.br.T;
import com.workspace.br.classes.ComparatorCor;
import com.workspace.br.classes.ComparatorIdade;
import com.workspace.br.classes.ComparatorNomeIdadeCor;
import com.workspace.br.classes.Gato;

import java.util.ArrayList;
import java.util.Collections;


public class ConteudoArrays {
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Jon",18,"preto"));
        gatos.add(new Gato("Patric",12,"amarelo"));
        gatos.add(new Gato("Jon",6,"tigrado"));
        gatos.add(new Gato("Jon",100,"caramelo"));

        // UTILIZANDO O COMPARABLE
        Collections.sort(gatos);

        // UTILIZANDO O COMPARATOR
        Collections.sort(gatos,new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        gatos.sort(new ComparatorCor());
        gatos.sort(new ComparatorNomeIdadeCor());

        System.out.println(T.json(gatos));
    }
}
