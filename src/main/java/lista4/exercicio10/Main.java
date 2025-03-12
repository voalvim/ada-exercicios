package lista4.exercicio10;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        int soma = Calculadora.soma(a, b);
        int sub = Calculadora.subtracao(a, b);
        int mult = Calculadora.multiplicacao(a, b);
        int div = Calculadora.divisao(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
}
