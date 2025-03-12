package aula7.exercicio2;

public sealed class CreditCard extends PaymentMethod permits Visa, MasterCard {
    @Override
    public void pay() {
        System.out.println("Pagamento no Crédito.");
    }
}