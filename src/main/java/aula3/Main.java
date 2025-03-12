package aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha um exercício para rodar (1-10) ou 0 para encerrar:");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (escolha) {
                case 1:
                    Exercicio1 ex1 = new Exercicio1();
                    ex1.dividirPorEntradaDoUsuario();
                    break;
                case 2:
                    Exercicio2 ex2 = new Exercicio2();
                    System.out.print("Digite uma idade: ");
                    int idade = scanner.nextInt();
                    try {
                        ex2.validarIdade(idade);
                        System.out.println("Idade válida.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    Exercicio3 ex3 = new Exercicio3();
                    int[] array = {1, 2, 3, 4, 5};
                    System.out.print("Digite um índice do array: ");
                    int indice = scanner.nextInt();
                    ex3.acessarElementoDoArray(array, indice);
                    break;
                case 4:
                    Exercicio4 ex4 = new Exercicio4();
                    ex4.converterStringParaInt();
                    break;
                case 5:
                    Exercicio5 ex5 = new Exercicio5();
                    ex5.acessarMetodoDeObjetoNulo();
                    break;
                case 6:
                    Exercicio6 ex6 = new Exercicio6();
                    System.out.print("Digite uma string: ");
                    String entrada = scanner.nextLine();
                    try {
                        int contagem = ex6.contarVogais(entrada);
                        System.out.println("Número de vogais: " + contagem);
                    } catch (Exercicio6.StringVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    Exercicio7 ex7 = new Exercicio7();
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    try {
                        boolean isPositivo = ex7.verificarPositivoNegativo(numero);
                        System.out.println("O número é " + (isPositivo ? "positivo" : "negativo"));
                    } catch (Exercicio7.ZeroException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    Exercicio8 ex8 = new Exercicio8();
                    System.out.print("Digite o nome do arquivo: ");
                    String nomeArquivo = scanner.nextLine();
                    ex8.lerArquivo(nomeArquivo);
                    break;
                case 9:
                    Exercicio9 ex9 = new Exercicio9();
                    ex9.tratarMultiplasExcecoes();
                    break;
                case 10:
                    Exercicio10 ex10 = new Exercicio10();
                    System.out.print("Digite um número: ");
                    String numeroStr = scanner.nextLine();
                    try {
                        ex10.validarNumeroNoIntervalo(numeroStr);
                        System.out.println("Número dentro do intervalo válido.");
                    } catch (Exercicio10.ValorForaDoIntervaloException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }
}