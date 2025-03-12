package lista2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercicio1 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite sua data de nascimento (YYYY-MM-DD):");
        String dataNascimento = scanner.nextLine();
        LocalDate nascimento = LocalDate.parse(dataNascimento);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento, hoje);
        System.out.println("Você tem " + idade.getYears() + " anos.");
    }
}