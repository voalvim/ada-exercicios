package lista6.exercicio5;

public class TaxCalculator {
    public double calculateTax(double purchaseAmount) {
        return purchaseAmount * 0.10;
    }

    public double calculateTax(double purchaseAmount, boolean applyDiscount) {
        if (applyDiscount) {
            purchaseAmount *= 0.95; // Aplica 5% de desconto
        }
        return purchaseAmount * 0.10;
    }
}
