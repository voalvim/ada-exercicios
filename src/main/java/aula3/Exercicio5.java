package aula3;

public class Exercicio5 {
    public void acessarMetodoDeObjetoNulo() {
        String stringNula = null;
        try {
            int comprimento = stringNula.length();
        } catch (NullPointerException e) {
            System.out.println("Pegou uma NullPointerException: Não é possível acessar método em um objeto nulo.");
        }
    }
}