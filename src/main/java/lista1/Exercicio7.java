package lista1;

import java.util.Scanner;

public class Exercicio7 {
    public void execute(Scanner scanner) {
        System.out.println("Por favor, insira a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}