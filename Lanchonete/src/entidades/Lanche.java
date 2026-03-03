package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    //Construtor
    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;
    }

    //Getters


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank()) {
            System.out.println("Informe um valor Válido");
        } else  {
            this.descricao = descricao;
        }

    }

    public void setValor(double valor) {

        if (valor <= 0) {
            System.out.println("Informe um valor positivo");
        } else {
            this.valor = valor;
            System.out.println("Valor inserido com sucesso");
        }
    }

    private void verificaDisponibilidade() {
        this.disponivel = this.estoque > 0;
    }

    public boolean decrementaestoqe(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            verificaDisponibilidade();
            return true;
        } else {
            return false;
        }
    }

    public void acrescerEstoque(int adicionaEstoque) {
        if (adicionaEstoque > 0) {
            this.estoque += adicionaEstoque;
            System.out.println("Estoque acrescendo com sucesso");
        } else   {
            System.out.println("Adicione um número válido");
        }
    }

    public double valorTotal(int quantidade) {
        return this.valor * quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDescricao: " + descricao +
                "\nValor: R$ " + valor +
                "\nEstoque: " + estoque +
                "\nDisponivel: " + disponivel ;
    }
}
