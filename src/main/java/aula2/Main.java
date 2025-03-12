package aula2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        while (true) {
            System.out.println("Selecione um exercício para rodar (1-17) ou 0 para sair:");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (escolha) {
                case 1:
                    Exercicio1.executar(scanner);
                    break;
                case 2:
                    Exercicio2.executar(scanner);
                    break;
                case 3:
                    Exercicio3.executar(scanner);
                    break;
                case 4:
                    Exercicio4.executar(scanner);
                    break;
                case 5:
                    Exercicio5.executar(scanner);
                    break;
                case 6:
                    Exercicio6.executar(scanner);
                    break;
                case 7:
                    Exercicio7.executar(scanner);
                    break;
                case 8:
                    Exercicio8.executar(scanner);
                    break;
                case 9:
                    Exercicio9.executar(scanner);
                    break;
                case 10:
                    Exercicio10.executar(scanner);
                    break;
                case 11:
                    Exercicio11.executar(scanner);
                    break;
                case 12:
                    Exercicio12.executar(scanner);
                    break;
                case 13:
                    Exercicio13.executar(scanner);
                    break;
                case 14:
                    Exercicio14.executar(scanner);
                    break;
                case 15:
                    Exercicio15.executar();
                    break;
                case 16:
                    Exercicio16.executar(scanner);
                    break;
                case 17:
                    Exercicio17.executar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }
    }
}