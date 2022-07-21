package br.com.dio.collections.set.atividadeProposta;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Rainbow {
    public static void main(String[] args) {
        Set<String> rainbowColors = new LinkedHashSet<String>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Indigo");
            add("Violet");
        }};
        System.out.println("A: exibir uma abaixo da outra!");
        for (String rainbowColor : rainbowColors) System.out.println(rainbowColor.toString());

        System.out.println("B: Quantidade de cores!");
        System.out.println(rainbowColors.size());

        System.out.println("C: Exibir as cores em ordem alfabetica!");
        Set<String> naturalOrderdRaibownColors = new TreeSet<String>(rainbowColors);
        System.out.println(naturalOrderdRaibownColors.toString());

        System.out.println("D: Exibir na ordem inversa!");
        List<String> rainbowColorsList = new ArrayList<>(rainbowColors);

        Collections.sort(rainbowColorsList, Collections.reverseOrder());

        System.out.println(rainbowColorsList);

        System.out.println("E: Exiba todas as cores que começam com a letra ”v”");
        for (String cor: rainbowColors) {
            if (cor.startsWith("V")) System.out.println(cor);
        }

        System.out.println("F: Remova todas as cores que não começam com a letra “v”! ");
        Iterator<String> iterator2 = rainbowColors.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(rainbowColors);

        System.out.println("G: Limpe o Conjunto");
        rainbowColors.clear();
        System.out.println(rainbowColors);

        System.out.println("H: esta vazio? " + rainbowColors.isEmpty());
    }

}
