package lista6.exercicio2;

public sealed class DebitCard extends PaymentMethod permits BancoX, BancoY {
    @Override
    public void pay() {
        System.out.println("Pagamento no Débito.");
    }
}
