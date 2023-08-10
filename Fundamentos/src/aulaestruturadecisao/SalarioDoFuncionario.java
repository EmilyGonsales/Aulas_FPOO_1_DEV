package aulaestruturadecisao;

import java.util.Scanner;

public class SalarioDoFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionario (Gerente, Supervisor, Tecnico ou Auxiliar): ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salario: R$ ");
        double informarSalario = scanner.nextDouble();

        double salarioLiquido = calcularSalario(cargo, informarSalario);

        if (salarioLiquido == -1) {
            System.out.println("Cargo nao encontrado na tabela.");
        } else {
            System.out.printf("O salario liquido do %s e de: R$ %.2f%n", cargo, salarioLiquido);
        }

        scanner.close();
    }

    public static double calcularSalario(String cargo, double informarSalario) {
        double descontoINSS = 0.0;
        double convenio = 0.0;

        switch (cargo) {
            case "Gerente":
                descontoINSS = informarSalario* 0.08;
                convenio = 289.00;
                break;
            case "Supervisor":
                descontoINSS = informarSalario * 0.07;
                convenio = 239.00;
                break;
            case "Tecnico":
                descontoINSS = informarSalario* 0.04;
                convenio = 189.00;
                break;
            case "Auxiliar":
                descontoINSS = informarSalario * 0.02;
                convenio = 156.00;
                break;
            default:
                return -1; // Cargo não encontrado
        }

        double salarioLiquido = informarSalario - descontoINSS - convenio;
        return salarioLiquido;
    }
}
