package aula2;

import java.util.Scanner;

public class Exercicio12 {
    public static void executar(Scanner scanner) {
        int count = 0;
        double sum = 0;
        double number;

        do {
            System.out.println("Digite um número (0 para sair):");
            number = scanner.nextDouble();
            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        if (count > 0) {
            double media = sum / count;
            System.out.println("Média aritmética: " + media);
            System.out.println("Quantidade de números inseridos: " + count);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
    }
}
