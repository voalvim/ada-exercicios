package lista3;

public class Exercicio6 {
    public class StringVaziaException extends Exception {
        public StringVaziaException(String mensagem) {
            super(mensagem);
        }
    }

    public int contarVogais(String entrada) throws StringVaziaException {
        if (entrada == null || entrada.isEmpty()) {
            throw new StringVaziaException("A string de entrada está vazia.");
        }

        int contagem = 0;
        for (char c : entrada.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contagem++;
            }
        }
        return contagem;
    }
}