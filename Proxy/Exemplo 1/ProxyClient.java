public class ProxyClient implements IClient {
    private RealClient realClient;

    public ProxyClient(String data) {
        this.realClient = new RealClient(data);
    }

    @Override
    public String getData() {
        System.out.println("ProxyClient: Forwarding request to RealClient");
        return realClient.getData();
    }
}
