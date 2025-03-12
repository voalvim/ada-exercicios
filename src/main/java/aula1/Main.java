package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicio1 ex1 = new Exercicio1();
        Exercicio2 ex2 = new Exercicio2();
        Exercicio3 ex3 = new Exercicio3();
        Exercicio4 ex4 = new Exercicio4();
        Exercicio5 ex5 = new Exercicio5();
        Exercicio6 ex6 = new Exercicio6();
        Exercicio7 ex7 = new Exercicio7();
        Exercicio8 ex8 = new Exercicio8();
        Exercicio9 ex9 = new Exercicio9();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Por favor, insira o número do exercício para executar (1-9) ou 0 para sair:");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (escolha == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.println("Executando Exercício 1:");
                    ex1.execute(scanner);
                    break;
                case 2:
                    System.out.println("Executando Exercício 2:");
                    ex2.execute(scanner);
                    break;
                case 3:
                    System.out.println("Executando Exercício 3:");
                    ex3.execute(scanner);
                    break;
                case 4:
                    System.out.println("Executando Exercício 4:");
                    ex4.execute(scanner);
                    break;
                case 5:
                    System.out.println("Executando Exercício 5:");
                    ex5.execute(scanner);
                    break;
                case 6:
                    System.out.println("Executando Exercício 6:");
                    ex6.execute(scanner);
                    break;
                case 7:
                    System.out.println("Executando Exercício 7:");
                    ex7.execute(scanner);
                    break;
                case 8:
                    System.out.println("Executando Exercício 8:");
                    ex8.execute(scanner);
                    break;
                case 9:
                    System.out.println("Executando Exercício 9:");
                    ex9.execute(scanner);
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, insira um número de 1 a 9 ou 0 para sair.");
            }
        }
        scanner.close();
    }
}