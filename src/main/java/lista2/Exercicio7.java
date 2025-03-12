package lista2;

import java.util.Scanner;

public class Exercicio7 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite quatro valores (A, B, C, D):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int maior = Math.max(Math.max(a, b), Math.max(c, d));
        int menor = Math.min(Math.min(a, b), Math.min(c, d));

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}