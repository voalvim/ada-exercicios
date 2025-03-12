package aula4.exercicio12;

public class Eletronico extends Produto {
    private static final double IMPOSTO = 0.2;

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * IMPOSTO);
    }
}