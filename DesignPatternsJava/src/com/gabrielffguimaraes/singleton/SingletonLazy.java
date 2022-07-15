package com.gabrielffguimaraes.singleton;

/*
 * Singleton "preguiçoso"
 * @author gabrielffguimaraes
 */
public class SingletonLazy {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(){
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
