package aula2;

import java.util.Scanner;

public class Exercicio9 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite seu peso (kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura (m):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Condição: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Condição: Peso Normal");
        } else if (imc < 30) {
            System.out.println("Condição: Acima do peso");
        } else {
            System.out.println("Condição: Obeso");
        }
    }
}