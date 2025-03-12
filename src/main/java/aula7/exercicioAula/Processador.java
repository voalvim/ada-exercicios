package aula7.exercicioAula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Processador {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1 - Filtrar apenas os números ímpares
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        // 2 - Multiplicar cada número par por 5
        List<Integer> multipliedEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 5)
                .toList();

        // 3 - Armazenar o resultado em uma nova lista e exibi-la no console
        List<Integer> result = new ArrayList<>(oddNumbers);
        result.addAll(multipliedEvenNumbers);

        System.out.println("Resultado: " + result);
    }
}