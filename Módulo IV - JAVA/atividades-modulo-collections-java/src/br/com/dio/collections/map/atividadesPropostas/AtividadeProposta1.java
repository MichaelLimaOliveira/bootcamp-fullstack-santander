package br.com.dio.collections.map.atividadesPropostas;

import java.util.*;

public class AtividadeProposta1 {
    public static void main(String[] args) {
        Map<String, Estados> estados = new HashMap<>(){{
            put("Pernanbuco", new Estados("PE", 9616621));
            put("Alagoas", new Estados("Al", 3351543));
            put("Ceará", new Estados("CE", 9187103));
            put("Rio Grande do Norte", new Estados("RN", 3534265));
        }};

        returnEstados(estados);

        System.out.println("-------------------topico A--------------------------");
        estados.put("Rio Grande do Norte", new Estados("RN", 3534165));

        returnEstados(estados);

        System.out.println("-------------------topico B--------------------------");
        System.out.println(estados.containsKey("Paraiba"));
        estados.put("Paraiba", new Estados("PB", 4039277));

        returnEstados(estados);

        System.out.println("---------------------topico C-------------------------");
        System.out.println(estados.get("Paraiba").getName() + " - " + estados.get("Paraiba").getPopulation());

        System.out.println("----------------------topico D-------------------------");
        Map<String, Estados> estadosLinkedMap = new LinkedHashMap<>(){{
            put("Pernanbuco", new Estados("PE", 9616621));
            put("Alagoas", new Estados("Al", 3351543));
            put("Ceará", new Estados("CE", 9187103));
            put("Rio Grande do Norte", new Estados("RN", 3534265));
        }};

        returnEstados(estadosLinkedMap);

        System.out.println("-------------------topico E--------------------------");
        Map<String, Estados> estadosTreeMap = new TreeMap<>(estadosLinkedMap);

        returnEstados(estadosTreeMap);

        System.out.println("--------------------topico F-------------------------");
        Map<String, Integer> estadosMap = new HashMap<>();

        for (Map.Entry<String, Estados> estado : estados.entrySet()) {
            estadosMap.put(estado.getValue().getName(), estado.getValue().getPopulation());
        }
        //System.out.println("exibe aki" + estados.values());
        //System.out.println("exibe aki 2" + estadosMap.values());
        Integer menorEstado = Collections.min(estadosMap.values());

        for (Map.Entry<String, Estados> estado : estados.entrySet()) {
            if(estado.getValue().getPopulation().equals(menorEstado)) System.out.println(estado.getValue().getName() + " - " + estado.getValue().getPopulation());
        }

        System.out.println("-------------------------topico G---------------------------------");

        Integer maiorEstado = Collections.max(estadosMap.values());

        for (Map.Entry<String, Estados> estado : estados.entrySet()) {
            if(estado.getValue().getPopulation().equals(maiorEstado)) System.out.println(estado.getValue().getName() + " - " + estado.getValue().getPopulation());
        }

        System.out.println("-------------------------topico H------------------------------------");
        //Exiba a soma da população desses estados;
        Integer sum = 0;
        for (Map.Entry<String, Estados> estado : estados.entrySet()) {
            sum += estado.getValue().getPopulation();
        }

        System.out.println("A soma das populaçoes é: " + sum);

        System.out.println("------------------------topico I----------------------------------------");
        Double average = Double.valueOf(sum / estados.size());

        System.out.println("A media da populaçao é: " + average);

        System.out.println("---------------------topico J--------------------------------------------");

        for (Map.Entry<String, Integer> estado : estadosMap.entrySet()) {
            if(estado.getValue() < 4000000) estados.remove(estado.getKey());
        }
        System.out.println(estadosMap);

        estados.clear();
        System.out.println("Esta vazio o dicionario? " + estados.isEmpty());

    }

    public static void returnEstados(Map<String, Estados> estados) {
        for (Map.Entry<String, Estados> estado : estados.entrySet()) {
            System.out.println(estado.getKey() + " = " + estado.getValue().getName() + " - População = " + estado.getValue().getPopulation());
        }
    }
}

class Estados implements Comparable<Map<String, Estados>> {
    private String name;
    private Integer population;

    public Estados(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estados estados = (Estados) o;
        return name.equals(estados.name) && population.equals(estados.population);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public String toString() {
        return "Estados{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(Map<String, Estados> o) {
        return 0;
    }
}
