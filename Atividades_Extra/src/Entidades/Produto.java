package Entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String descricao;


    //Construtor

    public Produto(String nome, double preco, int quantidade, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Metodo

    //Calcular Valor Total
    public double CalcularValorEstoque() {
        return (this.quantidade * this.preco);
    }

    //Mostrar
    @Override
    public String toString() {
        return "| " + nome + " | " + preco + " | " + quantidade +  " | " + CalcularValorEstoque() + " | " + descricao + " |";
    }

}