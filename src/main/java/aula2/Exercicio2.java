package aula2;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio2 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite uma data (YYYY-MM-DD):");
        String data = scanner.nextLine();
        LocalDate dataInformada = LocalDate.parse(data);

        if (dataInformada.getMonthValue() == 12 && dataInformada.getDayOfMonth() == 25) {
            System.out.println("É Natal!");
        } else if (dataInformada.getMonthValue() == 1 && dataInformada.getDayOfMonth() == 1) {
            System.out.println("É Ano Novo!");
        } else {
            System.out.println("A data não é um feriado.");
        }
    }
}