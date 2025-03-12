package lista6.exercicio9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudante> estudantes = Arrays.asList(
                new Estudante("Alice", 8.5),
                new Estudante("Bob", 6.0),
                new Estudante("Charlie", 7.0),
                new Estudante("David", 5.5)
        );

        List<String> aprovados = estudantes.stream()
                .filter(e -> e.getNota() >= 7)
                .map(Estudante::getNome)
                .toList();

        aprovados.forEach(System.out::println);
    }
}
