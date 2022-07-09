package com.workspace.br.classes;

import java.util.Comparator;

public class ComparatorInverse implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -1;
    }
}
