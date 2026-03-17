import Entidades.Produto;
import Entidades.GerenciarListaProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarListaProdutos lista = new GerenciarListaProdutos();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("======== Menu de Opções ========");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Sair");
            System.out.println("Digite a opção desejada para o produto: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.print("Digite o nome do Produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o preço do Produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a quantidade do Produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Produto produto = new Produto(nome, preco, quantidade);

                    lista.cadastrarProduto(produto);
                }

                case "2" -> {
                    lista.listarProdutos();
                }

                case "3" -> {
                    lista.listarProdutos();

                    System.out.print("Digite o novo ID do Produto: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o novo nome do Produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o novo Preco do Produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a quantidade no estoque do Produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    lista.atualizarProduto(idProduto, nome, preco, quantidade);
                }

                case "4" -> {
                    lista.listarProdutos();
                    System.out.print("Digite o ID do Produto: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    lista.removerProduto(idProduto);
                }

                case "5" -> {
                    System.out.println("Saindo do Programa");
                    return;
                }
            }

        }
    }
}
