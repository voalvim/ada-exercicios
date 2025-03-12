package lista5.exercicio6;

public class Main {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Valor armazenado na Box de Integer: " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");
        System.out.println("Valor armazenado na Box de String: " + stringBox.get());
    }
}