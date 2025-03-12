package lista5.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatalogoFilmes catalogo = new CatalogoFilmes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar filme");
            System.out.println("2. Buscar filme por título");
            System.out.println("3. Listar todos os filmes");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do filme: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o diretor do filme: ");
                    String diretor = scanner.nextLine();
                    System.out.print("Digite o ano de lançamento do filme: ");
                    int anoLancamento = scanner.nextInt();
                    System.out.print("Digite a avaliação do filme (0 a 10): ");
                    double avaliacao = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha

                    Filme filme = new Filme(titulo, diretor, anoLancamento, avaliacao);
                    catalogo.adicionarFilme(filme);
                    System.out.println("Filme adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o título do filme que deseja buscar: ");
                    String tituloBusca = scanner.nextLine();
                    Filme filmeEncontrado = catalogo.buscarFilmePorTitulo(tituloBusca);
                    if (filmeEncontrado != null) {
                        System.out.println("Filme encontrado: " + filmeEncontrado);
                    } else {
                        System.out.println("Filme não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de todos os filmes:");
                    for (Filme f : catalogo.listarFilmes()) {
                        System.out.println(f);
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}