package aula7.exercicio2;

public sealed class PaymentMethod permits CreditCard, DebitCard, Cash {
    public void pay() {
        System.out.println("Pagamento genérico.");
    }
}