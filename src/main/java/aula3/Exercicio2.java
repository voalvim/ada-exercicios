package aula3;

import java.util.Scanner;

public class Exercicio2 {
    public static void verificarIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida: " + idade);
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Insira uma idade: ");
            int idade = sc.nextInt();
            verificarIdade(idade);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}