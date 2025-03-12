package lista1;

import java.util.Scanner;

public class Exercicio6 {
    public void execute(Scanner scanner) {
        System.out.println("Por favor, insira o raio da circunferência:");
        double raio = scanner.nextDouble();

        double area = calcularAreaCircunferencia(raio);
        System.out.println("A área da circunferência é: " + area);
    }

    public double calcularAreaCircunferencia(double raio) {
        final double PI = 3.14;
        return PI * raio * raio;
    }
}