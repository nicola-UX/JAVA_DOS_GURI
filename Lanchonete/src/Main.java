import entidades.Lanche;

import java.lang.invoke.CallSite;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lanche x_burguer = new Lanche("X-BURGUER",
                "Pão, Hamburguer, Queijo, Maionese Verde",
                24.9, 10
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----LISTA DE OPÇÕES----");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICIONAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4 - ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÃO");
            System.out.println("6 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            if  (opcao.equals("6")) {
                System.out.println("Obrigado por usar o programa!");
                break;
            }

            switch (opcao) {
                case "1":
                    System.out.println("Quantos lanches você deseja: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.decrementaestoqe(quantidade)) {
                        System.out.println("Você pediu " + quantidade + " " + x_burguer.getNome() + "e o valor final , foi de R$ " + x_burguer.valorTotal(quantidade));
                    }else {
                        System.out.println("Pedido não realizado!");
                        System.out.println("Quantidade inválida");
                    }
                    break;

                case "2":
                    System.out.println("Quantos itens você  deseja adicionar: ");
                    int adicionaEstoque = sc.nextInt();
                    sc.nextLine();
                    x_burguer.acrescerEstoque(adicionaEstoque);
                    System.out.println("Total no estoque: " + x_burguer.getEstoque() );
                    break;

                case "3":
                    System.out.println(x_burguer.toString());
                    break;

                case "4":
                    System.out.println("O lanche:" + x_burguer.toString() + "Custa");
                    System.out.println("Informe  novo valor do Lnche");
                    double valor = sc.nextDouble();
                    x_burguer.setValor(valor);
                    sc.nextLine();
                    break;

                case "5":
                    System.out.println("O lanche:" + x_burguer.toString() + "Custa");
                    System.out.println("Informe a nova descrição do lanche");
                    String descricao = sc.nextLine();
                    x_burguer.setDescricao(descricao);
                    break;

                    default:
                        System.out.println("Informe uma opção válda");
                        break;
            }
        }
    }

}

