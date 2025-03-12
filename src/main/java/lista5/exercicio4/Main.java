package lista5.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do produto: ");
            var nome = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            var preco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            produtos.add(new Produto(nome, preco));
        }

        System.out.println("\nProdutos cadastrados:");
        var total = 0.0;
        for (var produto : produtos) {
            System.out.println(produto);
            total += produto.preco();
        }

        System.out.printf("Total da compra: R$ %.2f%n", total);
        scanner.close();
    }
}
