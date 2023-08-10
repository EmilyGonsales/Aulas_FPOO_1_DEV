package aulaestruturadecisao;
import java.util.Scanner;
public class AlmoçoComOsColegas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu prato para o almoco:");
        System.out.println("1 - Arroz, feijao, bife acebolado (R$ 19,99)");
        System.out.println("2 - Arroz, feijao, file de frango (R$ 18,99)");
        System.out.println("3 - Arroz, feijao, brajola (R$ 23,99)");
        System.out.print("Digite o numero da opcao em que deseja: ");
        
        int opcao = scanner.nextInt();
        
        if (opcao < 1 || opcao > 3) {
            System.out.println("Opcao invalida! Por favor, escolha uma outra opcao.");
            scanner.close();
            return;
        }

        System.out.print("Informe a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        
        double valorPrato = 0.0;

        switch (opcao) {
            case 1:
                valorPrato = 19.99;
                break;
            case 2:
                valorPrato = 18.99;
                break;
            case 3:
                valorPrato = 23.99;
                break;
        }

        double valorTotal = valorPrato * quantidadePessoas;
        
        System.out.printf("O valor total a ser pago o almoco e de: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
        
