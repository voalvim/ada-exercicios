package aula2;

import java.util.Scanner;

public class Exercicio14 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite a quantidade de números:");
        int n = scanner.nextInt();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}