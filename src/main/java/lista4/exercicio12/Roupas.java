package lista4.exercicio12;

public class Roupas extends Produto {
    private static final double DESCONTO = 0.1;

    public Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * DESCONTO);
    }
}
