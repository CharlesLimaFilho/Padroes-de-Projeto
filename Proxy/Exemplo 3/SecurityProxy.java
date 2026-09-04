public class SecurityProxy implements IDataBase {
    private final DataBase dataBase;

    public SecurityProxy(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public boolean connect(Client client) {
        if (client.getId() == 1) {
            System.out.println("[Security] Acesso permitido para o cliente: " + client.getName());
            dataBase.connect(client);
            return true;
        } else {
            System.out.println("[Security] Acesso negado para o cliente: " + client.getName());
            return false;
        }
    }

    @Override
    public void disconnect() {
        dataBase.disconnect();
    }

    @Override
    public void execute(String query) {
        dataBase.execute(query);
    }
    
}
