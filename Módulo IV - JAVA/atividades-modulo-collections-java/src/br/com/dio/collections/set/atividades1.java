package br.com.dio.collections.set;

import java.util.*;

public class atividades1 {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<Double>(){{
            add(3.4d);
            add(5.4d);
            add(5.8d);
            add(1.2d);
            add(3.2d);
            add(1.2d);
            add(9.9d);
            add(5.4d);
        }};

        System.out.println(notas.toString());

        System.out.println("A menor nota é: " + Collections.min(notas));
        System.out.println("A maior nota é: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0d;

        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma é: " + Math.round(soma));
        Double average = soma / notas.size();
        System.out.println("A media é: " + average);
        notas.remove(1.2d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println("removido notas menores que 7:");
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<Double>(){{
            add(3.4d);
            add(5.4d);
            add(5.8d);
            add(1.2d);
            add(3.2d);
            add(1.2d);
            add(9.9d);
            add(5.4d);
        }};
        System.out.println("lista na ordem de inserçao:");
        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<Double>(){{
            add(3.4d);
            add(5.4d);
            add(5.8d);
            add(1.2d);
            add(3.2d);
            add(1.2d);
            add(9.9d);
            add(5.4d);
        }};
        System.out.println("lista na ordem natural: ");
        System.out.println(notas3);

        System.out.println("apagando todas as notas");
        notas.clear();
        System.out.println(notas);

        System.out.println("A lista de notas esta vazia? " + notas.isEmpty());
        System.out.println("A lista de notas2 esta vazia? " + notas2.isEmpty());
        System.out.println("A lista de notas3 esta vazia? " + notas3.isEmpty());
    }
}
