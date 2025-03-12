package lista3;

public class Exercicio9 {
    public void tratarMultiplasExcecoes() {
        try {
            int resultado = 10 / 0;
            String stringNula = null;
            stringNula.length();
        } catch (ArithmeticException | NullPointerException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Pegou uma ArithmeticException: " + e.getMessage());
            } else if (e instanceof NullPointerException) {
                System.out.println("Pegou uma NullPointerException: " + e.getMessage());
            }
        }
    }
}