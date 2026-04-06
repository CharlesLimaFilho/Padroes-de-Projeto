// Subscriber

public class Customer implements EventListener {
    private String name;

    private String email;

    private String phone;

    private String address;

    public Customer(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public void update(String context) {
        System.out.println(context);
    }
}
