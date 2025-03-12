package aula1;

import java.util.Scanner;

public class Exercicio9 {
    public void execute(Scanner scanner) {
        System.out.println("Por favor, insira seu nome:");
        String nome = scanner.next();
        System.out.println("Por favor, insira o dia da semana em que você nasceu:");
        String diaSemana = scanner.next();
        System.out.println("Por favor, insira o ano em que você nasceu:");
        int ano = scanner.nextInt();

        String mensagem = String.format("Olá %s, você nasceu em uma %s, no ano %d.", nome, diaSemana, ano);
        System.out.println(mensagem);
    }
}
