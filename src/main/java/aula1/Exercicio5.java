package aula1;
import java.util.Scanner;

public class Exercicio5 {
    public void execute(Scanner scanner) {
        System.out.println("Por favor, insira o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Por favor, insira o segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Por favor, insira o terceiro número:");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média aritmética é: " + media);
    }
}