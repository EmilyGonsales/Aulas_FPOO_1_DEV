package aulaestruturadecisao;

import java.util.Scanner;

public class CalcularValorDaConstrução {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a largura do terreno (em metros): ");
        double larguraTerreno = scanner.nextDouble();

        System.out.print("Informe o comprimento do terreno(em metros): ");
        double comprimentoTerreno = scanner.nextDouble();

        double areaTotal = larguraTerreno * comprimentoTerreno;
        double valorPorMetroQuadrado;

        if (areaTotal <= 250) {
            valorPorMetroQuadrado = 8.50;
        } else if (areaTotal <= 350) {
            valorPorMetroQuadrado = 9.50;
        } else {
            valorPorMetroQuadrado = 11.50;
        }

        double valorTotal = areaTotal * valorPorMetroQuadrado;

        System.out.printf("O valor a ser pago para ser construido a planta e de: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
