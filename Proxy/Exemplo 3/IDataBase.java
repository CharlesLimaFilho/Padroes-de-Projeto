public interface IDataBase {
    boolean connect(Client client);
    void disconnect();
    void execute(String query);
}