package aula4.exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2025);
        carro1.setCor("Preto");

        Carro carro2 = new Carro();
        carro2.setMarca("Toyota");
        carro2.setModelo("Corolla");
        carro2.setAno(2025);
        carro2.setCor("Preto");

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        if (carro1.equals(carro2)) {
            System.out.println("Os carros são iguais.");
        } else {
            System.out.println("Os carros são diferentes.");
        }
    }
}
