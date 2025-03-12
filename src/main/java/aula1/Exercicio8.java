package aula1;

import java.util.Scanner;

public class Exercicio8 {
    public void execute(Scanner scanner) {
        System.out.println("Por favor, insira o tempo gasto na viagem (em horas):");
        double tempo = scanner.nextDouble();
        System.out.println("Por favor, insira a velocidade média durante a viagem (em km/h):");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.printf("Quantidade de litros utilizada na viagem: %.2f litros.\n", litrosUsados);
    }
}