package com.gabrielffguimaraes.strategy;

/*OBS :
* padrao strategy : utiliza como core o conceito de polimorfismo .
* */
public class Main {
    public static void main(String[] args) {
        Robo cop = new Robo();
        cop.mover();
        cop.setComportamento(new ComportamentoDefensivo());
        cop.mover();

        cop.setComportamento(new ComportamentoAgressivo());
        cop.mover();

        cop.setComportamento(new ComportamentoNormal());
        cop.mover();
    }
}
