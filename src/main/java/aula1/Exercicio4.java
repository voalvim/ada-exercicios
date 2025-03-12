package aula1;

import java.util.Scanner;

public class Exercicio4 {
    public void execute(Scanner scanner) {
        System.out.println("Por favor, insira o valor de A:");
        String a = scanner.nextLine();
        System.out.println("Por favor, insira o valor de B:");
        String b = scanner.nextLine();

        // Troca dos valores
        String temp = a;
        a = b;
        b = temp;

        System.out.println("Após a troca, o valor de A é: " + a);
        System.out.println("Após a troca, o valor de B é: " + b);
    }
}