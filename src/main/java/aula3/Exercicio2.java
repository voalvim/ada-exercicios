package aula3;

public class Exercicio2 {
    public void validarIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("A idade deve estar entre 0 e 120.");
        }
    }
}