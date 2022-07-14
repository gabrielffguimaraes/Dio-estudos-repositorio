package com.workspace.br.exceptions;

import javax.swing.*;

public class ExceptionPart1 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Entrada inválida, informe um numero válido. "+ e.getMessage());
        } finally {
            System.out.println("end");
        }


    }
    public static int dividir (int a , int b) {
        return a / b;
    }
}
