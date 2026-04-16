/*
Aqui fica a interface que será utilizada pelos clientes
caso haja alguma mudanca no estado do objeto de interesse.
 */

public interface Observer {
    public void update(String context);
}
