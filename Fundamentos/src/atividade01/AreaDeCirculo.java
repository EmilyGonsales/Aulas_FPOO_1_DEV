package atividade01;

import java.util.Scanner;

public class AreaDeCirculo {

    public static void main(String[] args) {

        double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite o raio: ");
        double raio = scanner.nextDouble();

        double area_ciculo = pi * raio * raio;

        System.out.println(" A area do circulo e: " + area_ciculo);

    }
}
