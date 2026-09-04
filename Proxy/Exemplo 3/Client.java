public class Client {
    private String name;
    private int id;

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id= " + id +
                '}';
    }

    public void requestAccess(IDataBase dataBase) {
        dataBase.connect(this);
    }

    public void makeRequest(IDataBase dataBase, String query) {
        dataBase.execute(query);
    }
}
