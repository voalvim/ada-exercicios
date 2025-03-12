package aula3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int[] array = {10, 20, 30, 40, 50};
            System.out.print("Digite um índice para acessar o array: ");
            int indice = scanner.nextInt();
            System.out.println("Valor no índice " + indice + ": " + array[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do limite do array.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        }
    }
}
