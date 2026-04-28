package Entidades;

public class ProdutoVestuario extends Produto {
    private Double tamanho;

    public ProdutoVestuario(String nome, double preco, int quantidade, String descricao, Double tamanho) {
        super(nome,  preco, quantidade, descricao);
        this.tamanho = tamanho;
    }

    //Construtor



    public Double getTamanho() {
        return tamanho;
    }

    public Double setTamanho(Double tamanho) {
        return tamanho;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                "| tamahno: " + tamanho;
    }
}
