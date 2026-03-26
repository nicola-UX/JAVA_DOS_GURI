package excecoes;

import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExececaoTxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while (true) {
            System.out.println("====SISTEMA====");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR PESSOA");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.println("Digite a opcao: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do Pessoa:");
                    String nome = sc.next();

                    System.out.println("Digite a idade da Pessoa:");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    try {
                        FileWriter write = new FileWriter("dados.txt", true);
                        write.write(nome + "," + idade + "\n");
                        write.close();
                        System.out.println("Dados cadastrados com sucesso!");
                    } catch (IOException e) {
                        System.out.println("ERRO AO CRIAR ARQUIVO");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Informe um valor numérico");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
                        String linha;
                        System.out.println("====LISTA DE PESSOAS====");
                        while ((linha = reader.readLine()) != null) {
                            System.out.println(linha);
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("ARQUIVO NÃO ENCONTRADO");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("ERRO AO LER O ARQUIVO");
                        System.out.println("Detalhe: " + e.getMessage());
                    }

                case "3":
                    System.out.println("\nSaindo do Programma...");
                    return;
            }
        }
    }
}
