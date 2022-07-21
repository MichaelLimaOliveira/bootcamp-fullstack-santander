package br.com.dio.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AtividadeSeries {
    public static void main(String[] args) {
        Set<Series> series1 = new LinkedHashSet<Series>(){{
            add(new Series("T.W.D", "Drama", 60));
            add(new Series("100", "Drama", 49));
            add(new Series("Supernatural", "Sobrenatual", 80));
            add(new Series("Sexy Education", "Comedia", 30));
            add(new Series("Dark", "terror", 20));
        }};

        for (Series serie : series1) System.out.println(serie.toString());

        System.out.println("-----ordem aleatoria----");

        Set<Series> series2 = new HashSet<Series>(series1);
        for (Series serie: series2) System.out.println(serie.toString());

        System.out.println("---Ordem natural---");
        Set<Series> series3 = new TreeSet<Series>(series1);
        for (Series serie: series3) System.out.println(serie.toString());



    }
}

class Series implements Comparable<Series>{
    private String name;
    private String gender;
    private Integer durationTime;

    public Series(String name, String gender, Integer durationTime) {
        this.name = name;
        this.gender = gender;
        this.durationTime = durationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", durationTime=" + durationTime + '}';
    }

    @Override
    public int compareTo(Series serie) {
        int name = this.getName().compareToIgnoreCase(serie.getName());
        int gender = this.getGender().compareToIgnoreCase(serie.getGender());
        if(name != 0) return gender;
        return name;
    }
}