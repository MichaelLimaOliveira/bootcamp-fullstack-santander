package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0d);
        notas.add(8.5d);
        notas.add(9.3d);
        notas.add(5.0d);
        notas.add(7.0d);
        notas.add(0.0D);
        notas.add(3.6D);

        System.out.println(notas.toString());

        System.out.println("exibe a posiçao da nota 5.0: " + notas.indexOf(5.0d));
        notas.add(4, 8.0d);
        System.out.println(notas.toString());

    }
}
