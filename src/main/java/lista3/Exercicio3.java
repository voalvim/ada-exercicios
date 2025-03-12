package lista3;

public class Exercicio3 {
    public void acessarElementoDoArray(int[] array, int indice) {
        try {
            System.out.println("Acessando elemento no índice " + indice + ": " + array[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: O índice " + indice + " está fora dos limites do array.");
        }
    }
}