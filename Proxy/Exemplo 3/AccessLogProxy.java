import java.util.HashMap;

public class AccessLogProxy implements IDataBase {
    private final SecurityProxy securityProxy;
    private final HashMap<Integer, Log> accessLog = new HashMap<>();
    private int logCounter = 0;

    public AccessLogProxy(DataBase dataBase) {
        this.securityProxy = new SecurityProxy(dataBase);
    }

    @Override
    public boolean connect(Client client) {
        logAccess(client, securityProxy.connect(client));
        return true;
    }

    @Override
    public void disconnect() {
        securityProxy.disconnect();
    }

    @Override
    public void execute(String query) {
        securityProxy.execute(query);
    }

    public void logAccess(Client client, boolean accessGranted) {
        accessLog.put(logCounter++, new Log(client.getName(), accessGranted));
    }
    
    public void printAccessLog() {
        System.out.println("[Access Log] Registro de Acessos:");
        for (Integer key : accessLog.keySet()) {
            Log log = accessLog.get(key);
            System.out.println("[Access Log] Cliente: " + log.getClientName() + ", Acesso autorizado: " + log.isAccessGranted());
        }
    }
}
