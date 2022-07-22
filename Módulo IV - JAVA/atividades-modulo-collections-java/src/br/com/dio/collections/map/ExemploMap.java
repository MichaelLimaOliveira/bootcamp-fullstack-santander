package br.com.dio.collections.map;

import java.util.*;

import static java.util.Collections.min;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione modelos e seus respectivos valores");

        Map<String, Double> cars = new HashMap<>(){{
            put("gol", 14.4);
            put("fiat", 18.2);
            put("marea", 22.3);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("vectra", 14.4);
            put("strada", 15.0 );
            put("ford", 19.2);
            put("tesla", 44.4 );
            put("modelX", 44.4);
        }};

        System.out.println(cars);

        System.out.println("Substitua o valor do consumo do gol para 15.2");
        cars.put("gol", 15.2);
        System.out.println(cars);

        System.out.println("Confira se o modelo tucson esta no dicionario:");
        System.out.println(cars.containsKey("tucson"));

        System.out.println("exiba o consumo do uno: " + cars.get("uno"));

//        System.out.println("exiba o terceiro modelo adicionado: " );

        System.out.println("exiba os modelos: ");
        Set<String> modelos = cars.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros:");
        System.out.println(cars.values());

        System.out.println("Exiba o modelo mais economico:");
        Double mostEfficientCar = Collections.max(cars.values());
        Set<Map.Entry<String, Double>> entries = cars.entrySet();
        String mostEfficientModel = "";

        for (Map.Entry<String, Double> entrie : entries) {
            if(entrie.getValue().equals(mostEfficientCar)){
                mostEfficientModel = entrie.getKey();
                System.out.println("Modelo mais eficiente: " + mostEfficientModel);
            }
        }

        System.out.println("Exiba o modelo menos economico");
        Double lessEfficientCar = Collections.min(cars.values());
        Set<Map.Entry<String, Double>> entries1 = cars.entrySet();
        String lessEfficientModel = "";

        for (Map.Entry<String, Double> entrie1 : entries1) {
            if(entrie1.getValue().equals(lessEfficientCar)) {
                lessEfficientModel = entrie1.getKey();
                System.out.println("Modelo menos eficiente: " + lessEfficientModel);
            }
        }

        System.out.println("exiba a soma dos consumos");
        Double sum = 0.0;
        for (Double car :cars.values()) {
            sum += car;
        }
        Iterator<Double> iterator = cars.values().iterator();
        Double sum2 = 0.0;
        while (iterator.hasNext()) {
            sum2 += iterator.next();
        }

        System.out.println(sum);
        System.out.println(sum2);

        System.out.println("exiba a media dos consumos:");
       /* Double average = sum/cars.size();
        System.out.println(average);*/

        System.out.println("remova os carros com consumo 15.6");
        System.out.println(cars);
        Iterator<Double> iterator1 = cars.values().iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println(cars);

        System.out.println("Exiba os carros na ordem informada");

        Map<String, Double> carsLinked = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("fiat", 18.2);
            put("marea", 22.3);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("vectra", 14.4);
            put("strada", 15.0 );
            put("ford", 19.2);
            put("tesla", 44.4 );
            put("modelX", 44.4);
        }};
        System.out.println(carsLinked);

        System.out.println("Exiba o modelo ordenadao pela chave: ");

        Map<String,Double> carsTree = new TreeMap<>(carsLinked);

        System.out.println(carsTree);

        System.out.println("Apague o dicionario de carros");
        cars.clear();
        System.out.println(cars);
        System.out.println("Carros esta vazio?" + cars.isEmpty());
    }

}
