public class Main {

    public static void main(String[] args) {
        Store store = new Store("Loja");

        Customer customer = new Customer("Lucas", "lucas@gmail.com", "44", "dd");

        store.eventManager.addSubscriber(customer);

        for (int i = 0; i < 12; i++) {
            store.decreaseNumbers();
        }
    }
}
