package lista6.exercicio1;

public sealed class Animal permits Mammal, Bird {
    public String sound() {
        return "Som genérico de animal";
    }
}