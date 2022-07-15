package com.gabrielffguimaraes.singleton;

/*
 * Singleton "singletonLazyHolder"
 * @author gabrielffguimaraes
 */
public class SingletonLazyHolder {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
