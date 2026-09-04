public class Main {
    public static void main(String[] args) {
        // Criando as implementações de envio
        CanalEnvio email = new EnvioEmail();
        CanalEnvio sms = new EnvioSMS();

        // Combinando qualquer Notificação com qualquer Canal
        Notificacao notif1 = new NotificacaoNormal(email);
        notif1.notificar("Seu relatório semanal está pronto.");

        Notificacao notif2 = new NotificacaoUrgente(sms);
        notif2.notificar("Servidor fora do ar!");

        // Trocando o canal sem mudar a regra de notificação urgente
        Notificacao notif3 = new NotificacaoUrgente(email);
        notif3.notificar("Falha no banco de dados.");
    }
}