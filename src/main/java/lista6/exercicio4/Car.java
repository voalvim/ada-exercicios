package lista6.exercicio4;

public sealed class Car extends Vehicle permits ElectricCar, GasolineCar, HybridCar {
    public String fuelType() {
        return "fuel type";
    }
}
