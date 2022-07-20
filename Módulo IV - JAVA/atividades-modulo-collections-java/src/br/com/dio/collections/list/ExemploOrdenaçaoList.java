package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenaçaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<Gato>(){{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("simba", 6, "tigrado"));
            add(new Gato("jon", 12, "amarelo"));
        }};

        System.out.println(gatos.toString());
        for (Gato gato : gatos) {
            System.out.println(gato.toString());
        }

        Collections.shuffle(gatos);
        System.out.println(gatos.toString());

        Collections.sort(gatos);
        System.out.println(gatos);

//        Collections.sort(gatos, new ComparatorByAge());
        gatos.sort(new ComparatorByAge());

        System.out.println(gatos);

        System.out.println("Color");
        gatos.sort(new ComparatorByColor());
        System.out.println(gatos);

        System.out.println("Name/color/Age");
        gatos.sort(new ComparatorByNameColorAge());
        System.out.println(gatos);
    }
}

class ComparatorByAge implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getAge(), gato2.getAge());
    }
}

class ComparatorByColor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getColor().compareToIgnoreCase(g2.getColor());
    }
}

class ComparatorByNameColorAge implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int name = g1.getName().compareToIgnoreCase(g2.getName());
        int cor = g1.getColor().compareToIgnoreCase(g2.getColor());
        int age = Integer.compare(g1.getAge(), g2.getAge());
        if(name != 0) return name;
        if(cor != 0) return cor;
        return age;
    }
}
