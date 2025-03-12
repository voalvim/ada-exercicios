package aula5.exercicio2;

public class Main {
    public static void main(String[] args) {
        Notificacao notificacaoEmail = new NotificacaoEmail();
        Notificacao notificacaoSMS = new NotificacaoSMS();
        Notificacao notificacaoPush = new NotificacaoPush();

        notificacaoEmail.enviar("nome@email.com", "Mensagem de email");
        notificacaoSMS.enviar("123456789", "Mensagem de SMS");
        notificacaoPush.enviar("usuario123", "Mensagem de push");
    }
}