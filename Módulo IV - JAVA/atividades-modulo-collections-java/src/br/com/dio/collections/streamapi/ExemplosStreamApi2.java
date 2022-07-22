package br.com.dio.collections.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemplosStreamApi2 {
    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de string");
        randomNumbers.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("trasforme a lista de string em uma lista de números inteiros");
        randomNumbers.stream()
                .map(Integer::parseInt)
                .toList()
                .forEach(System.out::println);

        System.out.println("Trasforme a lista em inteiro e pegue os numeros pares maior que 2");

        List<Integer> randomNumber2 = new java.util.ArrayList<>(randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 0))
                .toList());

        System.out.println(randomNumber2);

        System.out.println("mostre a media");

        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("mostrar o maior numero");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        System.out.println("Mostrar menor numero");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);

        randomNumber2.removeIf(integer -> integer % 2 != 0);

        System.out.println("ignore os tres primeiros elementos da lista e imprima o resto");
        System.out.println(randomNumbers);
        randomNumbers.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("retirando os numeros repitidos quantos numerops ficam");

        System.out.println(randomNumbers.stream()
                .distinct()
                .toList()
                .size());

        System.out.println("soma dos numeros impares");
        System.out.println(randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .sum());

        randomNumbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
