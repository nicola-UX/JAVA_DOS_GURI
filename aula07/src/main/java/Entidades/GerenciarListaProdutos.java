package Entidades;

import java.util.ArrayList;

public class GerenciarListaProdutos {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    //Create - Cadastrar Produto
    public void cadastrarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");

    }

    //Listar os Produtos
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto encontrado no estoque!");
        } else  {
            System.out.println("ID | Produtos | Preco | Quantidade | Valor Total no Estoque");
            for (int i=0; i<listaProdutos.size(); i++) {
                System.out.println("|" + i + listaProdutos.get(i));
            }
        }
    }

    //Alterar Informações
    public void atualizarProduto(int idproduto, String nome, double preco, int quantidade) {

        Produto produto = listaProdutos.get(idproduto);

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        System.out.println("Produto atualizado com sucesso!");

    }

    //Remover Produto
    public void removerProduto(int idProduto) {
        listaProdutos.remove(idProduto);
        System.out.println("Produto removido com sucesso!");
    }
}