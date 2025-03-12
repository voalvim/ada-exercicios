package lista5.exercicio1;

public class Triangulo implements Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Para simplificação, consideramos um triângulo isósceles
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return base + 2 * lado;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
