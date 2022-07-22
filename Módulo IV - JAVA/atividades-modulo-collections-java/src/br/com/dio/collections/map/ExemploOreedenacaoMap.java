package br.com.dio.collections.map;

import java.util.*;

public class ExemploOreedenacaoMap {
    public static void main(String[] args) {
        System.out.println("-----------Exibir na ordem aleatoria---------------");
        Map<String, Books> booksHashMap = new HashMap<>(){{
           put("Hawking, Stephen", new Books("Uma Breve historia", 256));
           put("Duhigg, Charles", new Books("O poder do Hábito", 408));
           put("Harari, Yuval Noah", new Books("21 Liçoes Para o Século 21", 432));
        }};

        for (Map.Entry<String, Books> book : booksHashMap.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }

        System.out.println("---------Ordem de inserçao--------------");
        Map<String, Books> booksLinkedMap = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Books("Uma Breve historia", 256));
            put("Duhigg, Charles", new Books("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Books("21 Liçoes Para o Século 21", 432));
        }};

        for (Map.Entry<String, Books> book : booksLinkedMap.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }

        System.out.println("--------------ordem alfabetica de autores-----------------");
        Map<String, Books> booksTreeMap = new TreeMap<>(booksLinkedMap);

        for (Map.Entry<String, Books> book : booksTreeMap.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }

        System.out.println("--------------Ordem alfabetica dos livros----------------");

        Set<Map.Entry<String, Books>> booksSetOrder = new TreeSet<>(new Comparator<Map.Entry<String, Books>>() {
            @Override
            public int compare(Map.Entry<String, Books> o1, Map.Entry<String, Books> o2) {
                return o1.getValue().getName().compareToIgnoreCase(o2.getValue().getName());
            }
        });
        booksSetOrder.addAll(booksHashMap.entrySet());

        for (Map.Entry<String, Books> book : booksSetOrder) {
            System.out.println(book.getKey() + " - " + book.getValue().getName());
        }

        System.out.println("-------------Ordem crescente de paginas--------------");
        Set<Map.Entry<String, Books>> booksSetOrderPages = new TreeSet<>(Comparator.comparing(
                book -> book.getValue().getPages()));
        booksSetOrderPages.addAll(booksHashMap.entrySet());

        for (Map.Entry<String, Books> book : booksSetOrderPages) {
            System.out.println(book.getKey() + " - " + book.getValue().getName() + " - " + book.getValue().getPages());
        }

    }
}

class Books {
    private String name;
    private Integer pages;

    public Books(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return name.equals(books.name) && pages.equals(books.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
