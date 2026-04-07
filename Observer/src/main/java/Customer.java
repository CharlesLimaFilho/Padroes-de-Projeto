// Subscriber

public class Customer implements EventListener {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String context) {
        System.out.println(getName() + " - " + context);
    }
}
