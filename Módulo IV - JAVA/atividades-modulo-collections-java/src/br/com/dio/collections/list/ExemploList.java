package br.com.dio.collections.list;

import java.util.*;

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
        notas.set(notas.indexOf(5.0d), 6.0d);
        System.out.println(notas.toString());
        System.out.println(notas.contains(5.0d));
        System.out.println(notas.contains(6.0d));

        for (double nota: notas) System.out.println(nota);

        System.out.println("A terceira nota adicionada é: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("A menor nota é: " + Collections.min(notas));
        System.out.println("A maior nota é: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println(soma/notas.size());
        notas.remove(0.0d);
        System.out.println(notas.toString());
        notas.remove(0);
        System.out.println(notas.toString());

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());
//        notas.clear();
        System.out.println(notas.toString());
        System.out.println(notas.isEmpty());

        LinkedList<Double> notas2 = new LinkedList<Double>();

        notas2.addAll(notas);
        System.out.println(notas);
        System.out.println(notas2);

        System.out.println(notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
     }
}
