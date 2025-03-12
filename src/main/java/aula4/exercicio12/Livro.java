package aula4.exercicio12;

public class Livro extends Produto {
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }
}