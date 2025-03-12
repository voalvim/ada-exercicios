package lista4.exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("TI");


        List<Funcionario> funcionarios = new ArrayList<>();

        Gerente gerente = new Gerente("Alice", 5000, 3000);
        Vendedor vendedor = new Vendedor("Bob", 3000, 500);

        funcionarios.add(gerente);
        funcionarios.add(vendedor);

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.calcularSalario());
        }

        departamento.adicionarFuncionario(gerente);
        departamento.adicionarFuncionario(vendedor);

        departamento.listarFuncionarios();
    }
}
