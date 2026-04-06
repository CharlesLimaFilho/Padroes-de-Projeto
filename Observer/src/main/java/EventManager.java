import java.util.ArrayList;

public class EventManager {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addSubscriber(Customer subscriber) {
        customers.add(subscriber);
    }

    public void removeSubscriber(Customer subscriber) {
        customers.remove(subscriber);
    }

    public void notifySubscriber(String context) {
        for (Customer customer : customers) {
            customer.update(context);
        }
    }
}
