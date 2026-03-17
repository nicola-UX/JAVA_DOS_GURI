package Entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    //Construtor

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    //Metodo

    //Calcular Valor Total
    public double CalcularValorEstoque() {
        return (this.quantidade * this.preco);
    }

    //Mostrar
    @Override
    public String toString() {
        return "| " + nome + " | " + preco + " | " + quantidade +  " | " + CalcularValorEstoque() + " | ";
    }

}