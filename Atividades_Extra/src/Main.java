import Entidades.GerenciarListaProdutos;
import Entidades.ProdutoAlimenticio;
import Entidades.ProdutoEletronico;
import Entidades.ProdutoVestuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarListaProdutos lista = new GerenciarListaProdutos();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("======== Menu de Opções ========");
            System.out.println("1 - Cadastrar Produto Eletronico");
            System.out.println("2 - Cadastrar Produto Vestuário");
            System.out.println("3 - Cadastrar Produto Alimentício");
            System.out.println("4 - Listar Produto");
            System.out.println("5 - Atualizar Produto");
            System.out.println("6 - Remover Produto");
            System.out.println("7  - Sair");
            System.out.println("Digite a opção desejada para o produto: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.print("Digite o nome do Produto Eletronico: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o preço do Produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a quantidade do Produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a descrição do Produto: ");
                    String descricao = sc.nextLine();

                    System.out.print("Digite a garantia do Produto: ");
                    int garantiaMeses = sc.nextInt();
                    sc.nextLine();

                    ProdutoEletronico produtoeletrico = new ProdutoEletronico(nome, preco, quantidade, descricao, garantiaMeses);

                    lista.cadastrarProduto(produtoeletrico);
                }

                case "2" ->{
                    System.out.print("Digite o nome do Produto de Vestuario: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o preço do Produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a quantidade do Produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a descrição do Produto: ");
                    String descricao = sc.nextLine();

                    System.out.print("Digite o tamanho da Peça: ");
                    Double tamanho = sc.nextDouble();
                    sc.nextLine();

                    ProdutoVestuario produtoVestuario = new ProdutoVestuario(nome, preco, quantidade, descricao, tamanho);

                    lista.cadastrarProduto(produtoVestuario);
                }

                case "3" -> {
                    System.out.print("Digite o nome do Produto Alimentício: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o preço do Produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a quantidade do Produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a descrição do Produto: ");
                    String descricao = sc.nextLine();

                    System.out.print("Digite a data de Validade do Produto: ");
                    String DataValidade = sc.nextLine();

                    ProdutoAlimenticio produtoalimenticio = new ProdutoAlimenticio(nome, preco, quantidade, descricao ,DataValidade);

                    lista.cadastrarProduto(produtoalimenticio);
                }

                case "4" -> {
                    lista.listarProdutos();
                }

                case "5" -> {
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

                case "6" -> {
                    lista.listarProdutos();
                    System.out.print("Digite o ID do Produto: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    lista.removerProduto(idProduto);
                }

                case "7" -> {
                    System.out.println("Saindo do Programa");
                    return;
                }
            }

        }
    }
}