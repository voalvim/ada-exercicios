package lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite o ano do carro:");
        int ano = scanner.nextInt();
        System.out.println("Digite o valor do carro:");
        double valor = scanner.nextDouble();

        double taxa = (ano < 1990) ? 0.01 : 0.015;
        double imposto = valor * taxa;

        System.out.println("O imposto a ser pago é: R$ " + imposto);
    }
}