package Entidades;

public class ProdutoAlimenticio extends Produto {
    private String DataValidade;

    //Construtor

    public ProdutoAlimenticio(String nome, Double preco, int quantidade, String descricao, String DataValidade) {
        super(nome, preco, quantidade, descricao);
        this.DataValidade = DataValidade;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String DataValidade) {
        this.DataValidade = DataValidade;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                "| Data de Validade: " + DataValidade;
    }
}
