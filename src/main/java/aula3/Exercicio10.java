package aula3;
public class Exercicio10 {
    public class ValorForaDoIntervaloException extends Exception {
        public ValorForaDoIntervaloException(String mensagem) {
            super(mensagem);
        }
    }

    public void validarNumeroNoIntervalo(String numeroStr) throws ValorForaDoIntervaloException {
        int numero;
        try {
            numero = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            throw new ValorForaDoIntervaloException("Formato de número inválido.");
        }

        if (numero < 1 || numero > 100) {
            throw new ValorForaDoIntervaloException("Número fora do intervalo válido (1-100).");
        }
    }
}