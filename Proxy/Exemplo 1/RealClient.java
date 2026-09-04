public class RealClient implements IClient {
    String data;

    public RealClient(String data) {
        System.out.println("RealClient: Creating RealClient with data: " + data);
        this.data = data;
    }


    @Override
    public String getData() {
        return data;
    }
    
}
