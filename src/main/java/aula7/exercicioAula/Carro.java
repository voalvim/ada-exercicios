package aula7.exercicioAula;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Carro {
    private String modelo;
    private String cor;
    private String marca;

    public Carro(String modelo, String cor, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    // Função que filtra carros por marca
    public static List<Carro> filtrarPorMarca(List<Carro> carros, String marca) {
        return carros.stream()
                .filter(carro -> carro.getMarca().equalsIgnoreCase(marca))
                .toList();
    }

    // Função que retorna o modelo mais longo
    public static Optional<String> modeloMaisLongo(List<Carro> carros) {
        return carros.stream()
                .map(Carro::getModelo)
                .max((m1, m2) -> Integer.compare(m1.length(), m2.length()));
    }
}