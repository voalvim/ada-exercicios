package aula2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio4 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite o horário de início (HH:mm:ss):");
        String horarioInicio = scanner.nextLine();
        System.out.println("Digite o horário de término (HH:mm:ss):");
        String horarioTermino = scanner.nextLine();

        LocalTime inicio = LocalTime.parse(horarioInicio);
        LocalTime termino = LocalTime.parse(horarioTermino);
        Duration duracao = Duration.between(inicio, termino);

        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        long segundos = duracao.getSeconds() % 60;
        System.out.println("Duração total: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
    }
}