package com.gabrielffguimaraes.facade;

import com.gabrielffguimaraes.subsistema.cep.CepApi;

/*
* Facade = é basicamente uma camada mais fina de um recurso mais complexo
* */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Gabriel","21832006");
    }
}
