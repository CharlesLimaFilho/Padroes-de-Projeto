public class Main {

    public static void main(String[] args) {
        Store store = new Store("Casa dos Celulares");
        Store store2 = new Store("Samsung");

        Customer customer = new Customer("Lucas");
        Customer customer2 = new Customer("Maria");
        Customer customer3 = new Customer("Pedro");

        store.eventManager.addObserver(customer);
        store.eventManager.addObserver(customer2);

        // Um mesmo cliente nao pode se inscrever duas vezes
        store.eventManager.addObserver(customer);

        store2.eventManager.addObserver(customer2);
        store2.eventManager.addObserver(customer3);

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
        store.eventManager.removeObserver(customer);

        store.alertAboutProduct();
        store2.alertAboutProduct();
    }
}
