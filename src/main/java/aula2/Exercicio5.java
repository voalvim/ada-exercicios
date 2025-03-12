package aula2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio5 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite a data e hora atuais (YYYY-MM-DDTHH:mm):");
        String dataHoraAtual = scanner.nextLine();
        System.out.println("Digite o intervalo em dias:");
        int dias = scanner.nextInt();
        System.out.println("Digite o intervalo em horas:");
        int horas = scanner.nextInt();

        LocalDateTime dataHora = LocalDateTime.parse(dataHoraAtual);
        LocalDateTime dataHoraEvento = dataHora.plusDays(dias).plusHours(horas);
        System.out.println("O evento está agendado para: " + dataHoraEvento);
    }
}