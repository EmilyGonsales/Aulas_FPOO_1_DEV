package atividade01;

import java.util.Scanner;

public class EmprestimoBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da casa que deseja comprar R$: ");
        double valorCasa = scanner.nextDouble();

        System.out.print("Informe o salario da pessoa: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Informe a quantidade de anos que quer pagar: ");
        int quantidadeAnos = scanner.nextInt();

        int quantidadeMeses = quantidadeAnos * 12;
        double prestacaoMensal = valorCasa / quantidadeMeses;

        double percentualMaxPrestacao = 0.30; // 30% do salário

        if (prestacaoMensal <= salario * percentualMaxPrestacao) {
            System.out.println("Emprestimo aprovado!");
            System.out.printf("Prestacao mensal: R$ %.2f", prestacaoMensal);
        } else {
            System.out.println("Emprestimo nao aprovado!");
        }

        scanner.close();
    }
}
