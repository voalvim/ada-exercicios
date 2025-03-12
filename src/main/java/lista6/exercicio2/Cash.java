package lista6.exercicio2;

public final class Cash extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pagamento no Dinheiro.");
    }
}
