package br.com.dio.collections.list.atividades;

import java.util.ArrayList;
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
        double sum = 0d;
        for(int i = 0; i < months.size(); i++) {
            Month month = months.get(i);
            sum += month.getTemperature();
        }
        double avarege = Math.round(sum / months.size());
        System.out.println("A media semestral é: " + avarege);
        System.out.println("Messes que tiveram temperaturas acima da media semestral: ");

        for (Month month : months) {
            if(month.getTemperature() > avarege ) System.out.println(month.getMonthName() + " ");
        }
        System.out.println();

    }
}
