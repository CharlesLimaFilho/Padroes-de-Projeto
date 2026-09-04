public class NotificacaoNormal extends Notificacao {
    public NotificacaoNormal(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensagem) {
        canal.enviar("Informativo: " + mensagem);
    }
}