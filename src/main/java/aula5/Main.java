package aula5;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Alice", 5000.0, 1500.0);
        Vendedor vendedor1 = new Vendedor("Bob", 3000.0, 800.0);
        Gerente gerente2 = new Gerente("Carol", 6000.0, 2000.0);
        Vendedor vendedor2 = new Vendedor("Dave", 2500.0, 500.0);

        Departamento departamento1 = new Departamento("Recursos Humanos");
        Departamento departamento2 = new Departamento("Vendas");

        departamento1.adicionarFuncionario(gerente1);
        departamento1.adicionarFuncionario(vendedor1);

        departamento2.adicionarFuncionario(gerente2);
        departamento2.adicionarFuncionario(vendedor2);
        departamento2.adicionarFuncionario(vendedor1); // Demonstrando que um funcionário pode estar em vários departamentos

        departamento1.exibirFuncionarios();
        System.out.println();
        departamento2.exibirFuncionarios();
    }
}