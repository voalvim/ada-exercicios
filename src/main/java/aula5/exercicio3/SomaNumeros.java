package aula5.exercicio3;

import java.util.List;

public class SomaNumeros {
    public static void main(String[] args) {
        var numeros = List.of(1, 2, 3, 4, 5);
        var soma = 0;

        for (var numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma total é: " + soma);
    }
}