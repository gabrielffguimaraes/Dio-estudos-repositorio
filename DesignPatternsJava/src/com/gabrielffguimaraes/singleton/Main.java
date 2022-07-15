package com.gabrielffguimaraes.singleton;

public class Main {
    public static void main(String[] args) {
        testSingletonEager();
        testSingletonLazyHolder();
        testSingletonLazy();
    }
    public static void testSingletonEager() {
        SingletonEager a = SingletonEager.getInstance();
        SingletonEager b = SingletonEager.getInstance();

        a.setText("A");
        b.setText("B");

        SingletonEager c = SingletonEager.getInstance();

        System.out.println(a.getText());
        System.out.println(b.getText());
        System.out.println(c.getText());
    }
    public static void testSingletonLazy() {
        SingletonLazy a = SingletonLazy.getInstance();
        SingletonLazy b = SingletonLazy.getInstance();

        a.setText("A");
        b.setText("B");

        SingletonLazy c = SingletonLazy.getInstance();

        System.out.println(a.getText());
        System.out.println(b.getText());
        System.out.println(c.getText());
    }
    public static void testSingletonLazyHolder() {
        SingletonLazyHolder a = SingletonLazyHolder.getInstance();
        SingletonLazyHolder b = SingletonLazyHolder.getInstance();

        a.setText("A");
        b.setText("B");

        SingletonLazyHolder c = SingletonLazyHolder.getInstance();

        System.out.println(a.getText());
        System.out.println(b.getText());
        System.out.println(c.getText());
    }
}
