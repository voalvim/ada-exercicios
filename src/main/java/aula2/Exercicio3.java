package aula2;

import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio3 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite o horário atual (HH:mm):");
        String horarioAtual = scanner.nextLine();
        System.out.println("Digite o intervalo em minutos:");
        int intervalo = scanner.nextInt();

        LocalTime horaAtual = LocalTime.parse(horarioAtual);
        LocalTime horaAlarme = horaAtual.plusMinutes(intervalo);
        System.out.println("O alarme tocará às " + horaAlarme);
    }
}