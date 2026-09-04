import static java.lang.Thread.sleep;

public class DataBase implements IDataBase {
    private boolean active = false;

    @Override
    public boolean connect(Client client) {
        if (active) {
            System.out.println("[DataBase] Já conectado ao banco de dados.");
            return false;
        }
        System.out.println("[DataBase] Conectando com o banco de dados...");

        try {
            sleep(2000);
            active = true;
            System.out.println("[DataBase] Conectado ao banco de dados.");
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void disconnect() {
        if (active) {
            System.out.println("[DataBase] Desconectando do banco de dados...");
            active = false;
        } else {
            System.out.println("[DataBase] Nenhum cliente conectado ao banco de dados.");
        }
    }

    @Override
    public void execute(String query) {
        if (!active) {
            System.out.println("[DataBase] Nenhum cliente conectado ao banco de dados. Não é possível executar a query.");
            return;
        }
        System.out.println("[DataBase] Executando query: " + query);
    }
    
}
