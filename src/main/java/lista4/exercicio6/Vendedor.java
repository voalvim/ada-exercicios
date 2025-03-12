package lista4.exercicio6;

public class Vendedor extends Funcionario {
    private double commissao;

    public Vendedor(String name, double salary, double commissao) {
        super(name, salary);
        this.commissao = commissao;
    }

    public double getCommissao() {
        return commissao;
    }

    public void setCommissao(double commissao) {
        this.commissao = commissao;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + commissao;
    }
}