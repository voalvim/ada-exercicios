package aula2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio6 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite a data e hora (YYYY-MM-DDTHH:mm):");
        String dataHora = scanner.nextLine();

        LocalDateTime dataHoraInformada = LocalDateTime.parse(dataHora);
        System.out.println("Dia da semana: " + dataHoraInformada.getDayOfWeek());

        LocalTime hora = dataHoraInformada.toLocalTime();
        LocalTime inicioExpediente = LocalTime.of(9, 0);
        LocalTime fimExpediente = LocalTime.of(18, 0);

        if (hora.isAfter(inicioExpediente) && hora.isBefore(fimExpediente)) {
            System.out.println("Está dentro do expediente comercial.");
        } else {
            System.out.println("Fora do expediente comercial.");
        }
    }
}