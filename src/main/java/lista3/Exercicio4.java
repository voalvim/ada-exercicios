package lista3;

public class Exercicio4 {
    public void converterStringParaInt() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("O número é: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro válido.");
        }
    }
}