public class Main {
    public static void main(String[] args) {
        IClient client = new ProxyClient("Sample Data");
        System.out.println(client.getData());
    }
}
