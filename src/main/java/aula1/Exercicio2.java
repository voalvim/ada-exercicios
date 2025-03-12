package aula1;
import java.util.Scanner;

public class Exercicio2 {
    public void execute(Scanner scanner) {
        System.out.println("Por favor, insira o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Por favor, insira o segundo número:");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos números é: " + soma);
    }
}