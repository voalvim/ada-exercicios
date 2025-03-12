package aula7.exercicioAula;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = Arrays.asList(
                new Carro("Civic", "Preto", "Honda"),
                new Carro("Corolla", "Prata", "Toyota"),
                new Carro("Mustang", "Vermelho", "Ford"),
                new Carro("Fit", "Prata", "Honda")
        );

        // Filtrar carros por marca
        List<Carro> carrosHonda = Carro.filtrarPorMarca(carros, "Honda");
        System.out.println("Carros da marca Honda: " + carrosHonda);

        // Encontrar o modelo mais longo
        Optional<String> modeloMaisLongo = Carro.modeloMaisLongo(carros);
        modeloMaisLongo.ifPresent(modelo -> System.out.println("Modelo mais longo: " + modelo));
    }
}