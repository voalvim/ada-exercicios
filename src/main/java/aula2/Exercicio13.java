package aula2;

import java.util.Scanner;

public class Exercicio13 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
    }
}