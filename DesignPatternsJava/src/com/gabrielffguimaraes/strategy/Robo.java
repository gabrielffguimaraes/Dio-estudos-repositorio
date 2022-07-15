package com.gabrielffguimaraes.strategy;

public class Robo {
    public Robo(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public Robo() {
        this.comportamento = new ComportamentoNormal();
    }
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
