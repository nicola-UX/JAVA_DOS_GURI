package Entidades;

public class ProdutoEletronico extends Produto {
    private int garantiaMeses;


    //Construtor
    public ProdutoEletronico(String nome, double preco, int quantidade, String descricao, int garantiaMeses) {
        super(nome, preco, quantidade, descricao);
        this.garantiaMeses = garantiaMeses;
    }

    //Getter
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    //Setter
    public int setGarantiaMeses(int garantiaMeses) {
        return garantiaMeses;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                "| Garantia: " + garantiaMeses;
    }
}

