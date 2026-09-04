public abstract class Notificacao {
    // A Ponte (composição em vez de herança)
    protected CanalEnvio canal;

    public Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract void notificar(String mensagem);
}