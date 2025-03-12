package aula4.exercicio5;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.getSalario() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}