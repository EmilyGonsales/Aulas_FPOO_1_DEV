package atividade01;

import java.util.Scanner;

public class SalarioDeFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double salarioLimite = 1350.00;
        final double percentualAumentoSuperior = 0.10;
        final double percentualAumentoInferior = 0.15;

        System.out.print(" Informe o salario do funcionario: R$ ");
        double salario = scanner.nextDouble();

        double aumento;
        if (salario > salarioLimite) {
            aumento = salario * percentualAumentoSuperior;
        } else {
            aumento = salario * percentualAumentoInferior;
        }

        double novoSalario = salario + aumento;
        System.out.printf("Adquiriu um aumento de: R$ %.2f e o novo salario e de: R$ %.2f ", aumento, novoSalario);

        scanner.close();
    }
}
