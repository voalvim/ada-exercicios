package aula2;

import java.util.Scanner;

public class Exercicio11 {
    public static void executar(Scanner scanner) {
        System.out.println("Digite o código do aluno:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double maiorNota = Math.max(nota1, Math.max(nota2, nota3));
        double mediaPonderada = (maiorNota * 4 + (nota1 + nota2 + nota3 - maiorNota) * 3) / 10;

        System.out.println("Código do aluno: " + codigo);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média Ponderada: " + mediaPonderada);

        if (mediaPonderada >= 5) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}