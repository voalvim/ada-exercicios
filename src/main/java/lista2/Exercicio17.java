package lista2;

import java.util.Scanner;

public class Exercicio17 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();
        String inverted = new StringBuilder(input).reverse().toString();
        System.out.println("String invertida: " + inverted);
    }
}