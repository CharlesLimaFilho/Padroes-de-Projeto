public class NotificacaoUrgente extends Notificacao {
    public NotificacaoUrgente(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensagem) {
        canal.enviar("ALERTA CRÍTICO: " + mensagem.toUpperCase());
    }
}