package lista3;

import java.util.Scanner;

public class Exercicio1 {
    public void dividirPorEntradaDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para dividir 100: ");
        int entradaUsuario = scanner.nextInt();

        try {
            int resultado = 100 / entradaUsuario;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }
    }
}