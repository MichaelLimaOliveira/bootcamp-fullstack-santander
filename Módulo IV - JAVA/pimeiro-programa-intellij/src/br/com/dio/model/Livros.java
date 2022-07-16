package br.com.dio.model;

public class Livros {
    private String nome;
    private String quantidadeDePaginas;
    private Number price;
    private Boolean disponivel;

    public Livros() {
    }

    public Livros(String nome, String quantidadeDePaginas, Number price, Boolean disponivel) {
        this.nome = nome;
        this.quantidadeDePaginas = quantidadeDePaginas;
        this.price = price;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(String quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
