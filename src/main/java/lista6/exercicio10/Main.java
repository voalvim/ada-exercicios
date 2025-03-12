package lista6.exercicio10;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Alice", 6000.0),
                new Funcionario("Bob", 4000.0),
                new Funcionario("Charlie", 7000.0),
                new Funcionario("David", 3000.0)
        );

        long count = funcionarios.stream()
                .filter(f -> f.getSalario() > 5000)
                .count();

        System.out.println("Number of employees earning above R$ 5000.00: " + count);
    }
}