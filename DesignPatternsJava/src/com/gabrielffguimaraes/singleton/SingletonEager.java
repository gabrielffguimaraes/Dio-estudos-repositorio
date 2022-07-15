package com.gabrielffguimaraes.singleton;

/*
 * Singleton "preguiçoso"
 * @author gabrielffguimaraes
 */
public class SingletonEager {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
