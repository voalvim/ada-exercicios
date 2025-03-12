package lista5.exercicio4;


public record Produto(String nome, double preco) {

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + preco;
    }
}
