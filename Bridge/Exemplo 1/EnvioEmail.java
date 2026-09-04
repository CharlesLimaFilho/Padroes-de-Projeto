public class EnvioEmail implements CanalEnvio {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-mail] Enviando: " + mensagem);
    }
}