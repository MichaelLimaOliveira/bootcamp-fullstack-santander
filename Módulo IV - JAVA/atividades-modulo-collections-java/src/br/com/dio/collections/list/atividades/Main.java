package br.com.dio.collections.list.atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Month> months = new ArrayList<>(){{
            add(new Month("janeiro", 35.4d));
            add(new Month("Fevereiro", 29.2d));
            add(new Month("Março", 22.2d));
            add(new Month("Abril", 21.1d));
            add(new Month("Maio", 19.3d));
            add(new Month("Junho", 14.2d));
        }};

        double averageTemperatureMonths = Collections.
    }
}
