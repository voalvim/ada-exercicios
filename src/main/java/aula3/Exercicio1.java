package aula3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            int result = 100 / num;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        }
    }
}