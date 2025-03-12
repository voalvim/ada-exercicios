package lista4.exercicio12;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");

        Produto eletronico = new Eletronico("Smartphone", 1000);
        Produto roupa = new Roupas("Camiseta", 50);
        Produto livro = new Livro("Livro de Java", 80);

        cliente.getCarrinho().adicionarProduto(eletronico);
        cliente.getCarrinho().adicionarProduto(roupa);
        cliente.getCarrinho().adicionarProduto(livro);

        Pagamento pagamento = new Pagamento(TipoPagamento.CARTAO_CREDITO);
        cliente.getCarrinho().setPagamento(pagamento);

        double total = cliente.getCarrinho().calcularTotal();
        System.out.println("Total da compra: " + total);
        System.out.println("Tipo de pagamento: " + cliente.getCarrinho().getPagamento().getTipoPagamento());
    }
}