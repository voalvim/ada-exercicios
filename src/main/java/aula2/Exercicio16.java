package aula2;

import java.util.Scanner;

public class Exercicio16 {
    public static void executar(Scanner scanner) {
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem contrária:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}