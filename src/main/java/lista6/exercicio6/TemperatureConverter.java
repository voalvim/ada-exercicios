package lista6.exercicio6;


public class TemperatureConverter {
    public double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32; // Converte Celsius para Fahrenheit
    }

    public double convertTemperature(double celsius, boolean toKelvin) {
        if (toKelvin) {
            return celsius + 273.15; // Converte Celsius para Kelvin
        } else {
            return (celsius * 9 / 5) + 32; // Converte Celsius para Fahrenheit
        }
    }
}
