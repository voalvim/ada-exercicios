package aula3;

public class Exercicio7 {
    public class ZeroException extends RuntimeException {
        public ZeroException(String mensagem) {
            super(mensagem);
        }
    }

    public boolean verificarPositivoNegativo(int numero) {
        if (numero == 0) {
            throw new ZeroException("O número é zero.");
        }
        return numero > 0;
    }
}