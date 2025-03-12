package aula5;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salario + comissao;
    }

    public double getComissao() {
        return comissao;
    }
}