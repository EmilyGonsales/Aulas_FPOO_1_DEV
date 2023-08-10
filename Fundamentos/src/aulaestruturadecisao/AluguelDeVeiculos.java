package aulaestruturadecisao;
import java.util.Scanner;
public class AluguelDeVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tabela de valores
        double valorDiariaFiatArgo = 98.00;
        double valorDiariaFiatMobi = 79.00;
        double valorDiariaHyundaiHb20 = 102.00;
        
        double valorPorKmFiatArgo = 2.39;
        double valorPorKmFiatMobi = 1.99;
        double valorPorKmHyundaiHb20 = 2.99;

        // Entrada do usuário
        System.out.println("Digite o veiculo:");
        System.out.println("1 - Fiat Argo");
        System.out.println("2 - Fiat Mobi");
        System.out.println("3 - Hyundai Hb20");
        int escolhaVeiculo = scanner.nextInt();

        System.out.println("Informe a quantidade de dias em que deseja alugar:");
        int diasAluguel = scanner.nextInt();

        System.out.println("Informe a quantidade de quilometros rodados:");
        double kmRodados = scanner.nextDouble();

        // Cálculos
        double valorTotalDiarias = 0.0;
        double valorTotalKmRodados = 0.0;

        switch (escolhaVeiculo) {
            case 1:
                valorTotalDiarias = valorDiariaFiatArgo * diasAluguel;
                valorTotalKmRodados = valorPorKmFiatArgo * kmRodados;
                break;
            case 2:
                valorTotalDiarias = valorDiariaFiatMobi * diasAluguel;
                valorTotalKmRodados = valorPorKmFiatMobi * kmRodados;
                break;
            case 3:
                valorTotalDiarias = valorDiariaHyundaiHb20 * diasAluguel;
                valorTotalKmRodados = valorPorKmHyundaiHb20 * kmRodados;
                break;
            default:
                System.out.println("Opcao invalida!");
                System.exit(1);
        }

        double valorTotal = valorTotalDiarias + valorTotalKmRodados;

        // Saída
        System.out.println("Valor total das diarias: R$ " + valorTotalDiarias);
        System.out.println("Valor total por km rodado: R$ " + valorTotalKmRodados);
        System.out.println("Valor total do aluguel: R$ " + valorTotal);

        scanner.close();
    }
}