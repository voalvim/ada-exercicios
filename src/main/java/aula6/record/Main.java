package aula6.record;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CatalogoFilmes catalogo = new CatalogoFilmes();

        Filme filme1 = new Filme("V for Vendetta", "James McTeigue", 2006, 8.1);
        Filme filme2 = new Filme("Oppenheimer", "Christopher Nolan", 2023, 8.3);
        Filme filme3 = new Filme("Interstellar", "Christopher Nolan", 2014, 8.7);

        catalogo.adicionarFilme(filme1);
        catalogo.adicionarFilme(filme2);
        catalogo.adicionarFilme(filme3);


        while(true) {
            System.out.println("O que gostaria de fazer?: ");
            System.out.println("[1] Buscar filme |  [2] Listar filmes | [3] Encerrar");
            System.out.print("> ");
            String choice = sc.next();
            if (choice.equals("3")) {
                System.out.println("Programa encerrado.");
                break;
            }
            switch(choice) {
                case "1" -> {
                    sc.nextLine(); //limpa buffer
                    System.out.print("Nome do filme: ");
                    String nomeDoFilme = sc.nextLine();
                    Filme filme = catalogo.buscarFilmePorTitulo(nomeDoFilme);
                    if (filme != null) {
                        System.out.println("Filme encontrado: " + filme);
                    } else {
                        System.out.println("Filme não encontrado.");
                    }
                }
                case "2" -> {
                    System.out.println("Lista de filmes no catálogo:");
                    for (Filme filme : catalogo.listarFilmes()) {
                        System.out.println(filme);
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}