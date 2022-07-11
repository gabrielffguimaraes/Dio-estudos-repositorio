package com.workspace.br.exceptions;

import javax.swing.*;

public class ConteudoExceptions2 {
    public static void main(String[] args) {
        int[] numerador = {4 ,5 ,8 ,10};
        int[] denominador = {2 ,4 ,0 ,8};

        for (int i = 0; i < denominador.length; i ++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisao nao exata", numerador[i], denominador[i]);
               if (denominador[i] == 0)
                    throw new ArithmeticException();
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                try {
                    throw new DivisaoPorZero();
                } catch (DivisaoPorZero ee) {
                    System.out.println(ee.getMessage());
                    JOptionPane.showMessageDialog(null, ee.getMessage());
                }
            } catch (DivisaoNaoExataException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        System.out.println("O programa continua");
    }
}
class DivisaoPorZero extends  Exception {
    public DivisaoPorZero() {
        super("Erro , divisao por zero nao valida .");
    }
}

