package aula5.exercicio2;

public class NotificacaoPush implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando notificação push para " + destinatario + ": " + mensagem);
    }
}