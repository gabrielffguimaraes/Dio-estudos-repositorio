package com.workspace.br.exercicios;

import com.workspace.br.T;

import java.util.*;

public class CalculoMedia {
    private static List<String> meses = Arrays.asList("janeiro","fevereiro","março","abril","maio","junho","julho"
            ,"agosto","setembro","outubro","novembro","dezembro");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Programa : entrega as temperaturas acima da média desse ano de 2022.");

        ArrayList<Temperature> temperatures = new ArrayList<>();
        float[] sumTemp = {0};
        meses.forEach(mes -> {
            System.out.println("Digite a temperatura do mes "+mes+" .");
            float temperatura = scan.nextFloat();
            sumTemp[0] +=temperatura;
            temperatures.add(new Temperature(mes,temperatura));
        });

        float[] media = {sumTemp[0] / temperatures.size()};

        ArrayList<Temperature> filtrados = new ArrayList<>();
        temperatures.forEach(temperature -> {
            if(temperature.temperatura > media[0]) {
                filtrados.add(temperature);
            }
        });
        System.out.println("Média : " + media[0]);
        System.out.println("Filtrados :");
        System.out.println(filtrados.toString());

    }
}
class Temperature {
    String mes;
    float temperatura;

    public Temperature(String mes, float temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes : " + mes + ", temperatura :" + temperatura +
                "}";
    }
}