public class EnvioSMS implements CanalEnvio {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] Enviando: " + mensagem);
    }
}