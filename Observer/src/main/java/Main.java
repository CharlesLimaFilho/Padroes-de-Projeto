public class Main {

    public static void main(String[] args) {
        Store store = new Store("Casa dos Celulares");
        Store store2 = new Store("Samsung");

        Customer customer = new Customer("Lucas");
        Customer customer2 = new Customer("Maria");
        Customer customer3 = new Customer("Pedro");

        store.eventManager.addSubscriber(customer);
        store.eventManager.addSubscriber(customer2);

        // Um mesmo cliente nao pode se inscrever duas vezes
        store.eventManager.addSubscriber(customer);

        store2.eventManager.addSubscriber(customer2);
        store2.eventManager.addSubscriber(customer3);

        // Lojas sem produtos
        store.alertAboutProduct();
        store2.alertAboutProduct();

        // Lojas comprando produtos
        store.buyStock();
        store2.buyStock();

        // Lojam alertando sobre produtos
        store.alertAboutProduct();
        store2.alertAboutProduct();

        // Removendo cliente
        store.eventManager.removeSubscriber(customer);

        store.alertAboutProduct();
        store2.alertAboutProduct();
    }
}
