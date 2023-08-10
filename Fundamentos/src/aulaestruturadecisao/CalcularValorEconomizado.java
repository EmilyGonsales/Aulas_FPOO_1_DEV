package aulaestruturadecisao;

import java.util.Scanner;

public class CalcularValorEconomizado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero do produto em que deseja:"
                + "\nNotebook Lenovo R$3299,00(1)"
                + "\nCelular MotoG22 R$1789,00(2)"
                + "\nCarro HB20  R$68000,00(3)"
                + "\nApartamento R$180000,00(4)");
        int produto = scanner.nextInt();

        double valor = 0;
        double ValorEconomizado = 0;
        double quantidadedeMeses = 0;

        if (produto == 1) {
            valor = 3299;
            ValorEconomizado = 0.05;
            quantidadedeMeses = valor / (valor * ValorEconomizado);
            System.out.println("A quantidade de meses para comprar o produto e de:" + quantidadedeMeses);
        } else if (produto == 2) {
            valor = 1789;
            ValorEconomizado = 0.1;
            quantidadedeMeses = valor / (valor * ValorEconomizado);
            System.out.println("A quantidade de meses para comprar o produto e de:" + quantidadedeMeses);
        } else if (produto == 3) {
            valor = 68000;
            ValorEconomizado = 0.2;
            quantidadedeMeses = valor / (valor * ValorEconomizado);
            System.out.println("A quantidade de meses para comprar o produto e de:" + quantidadedeMeses);
        } else if (produto == 4) {
            valor = 180000;
            ValorEconomizado = 0.01;
            quantidadedeMeses = valor / (valor * ValorEconomizado);
            System.out.println("A quantidade de meses para comprar o produto e de:" + quantidadedeMeses);

        }
    }
}
