public class Livro {
    //Atributos
    String titulo;
    String autor;
    int qtd;
    double preco;

    //Construtor
    public Livro(String titulo, String autor, int qtd, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtd = qtd;
        this.preco = preco;
    }

    //Exibir inforações do Livro
    public void exibirInformaces(){
        System.out.println("Título: " + this.titulo
                + "\nAutor:" + this.autor
                + "\nQuantidade: " + this.qtd
                + "\nValor do ivro: " + this.preco
                + "\nValor Total: R$ " + valorTotal() + "\n");
    }

    //Devolver / Emprestar Livros
    public void emprestaLivro(int qtd){
        if (qtd>0 && qtd<=this.qtd){
            this.qtd -= qtd;
            System.out.println("Emprestado com sucesso! Quantidade atual: " + this.qtd);
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    public void DevolverLivro(int qtd){
        if (qtd>0){
            this.qtd += qtd;
            System.out.println("Devolvido com Sucesso! Quantidade atual: " + this.qtd);
        } else {
            System.out.println("Calma Calabreso");
        }
    }

    public double valorTotal(){
        double totalprice = this.preco * this.qtd;
        return totalprice;
    }
}