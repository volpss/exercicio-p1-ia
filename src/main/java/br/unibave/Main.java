package br.unibave;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Criar Funcionário");
            System.out.println("2. Criar Vendedor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();

                    System.out.print("Salário base: ");
                    double salarioF = sc.nextDouble();

                    Funcionario f = new Funcionario(nomeF, salarioF);
                    System.out.println(f.exibirInformacoes());
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeV = sc.nextLine();

                    System.out.print("Salário base: ");
                    double salarioV = sc.nextDouble();

                    System.out.print("Comissão por venda: ");
                    double comissao = sc.nextDouble();

                    System.out.print("Quantidade de vendas: ");
                    int vendas = sc.nextInt();

                    Vendedor v = new Vendedor(nomeV, salarioV, comissao, vendas);
                    System.out.println(v.exibirInformacoes());
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }
}