package br.com.dio;


import br.com.dio.model.Gato;

import javax.xml.namespace.QName;

public class PirmeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!");*/

        Gato gato = new Gato();
        System.out.println(gato);

        Magazines magazine = new Magazines("Cazaki", "300", 200);

        System.out.println(magazine);
    }
}

class Magazines {
    private String name;
    private String pages;
    private Number value;

    public Magazines(String name, String pages, Number value) {
        this.name = name;
        this.pages = pages;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "name='" + name + '\'' +
                ", pages='" + pages + '\'' +
                ", value=" + value +
                '}';
    }
}
