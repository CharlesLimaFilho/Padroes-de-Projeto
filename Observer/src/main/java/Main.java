public class Main {

    public static void main(String[] args) {
        Store store = new Store("Loja 1");
        Store store2 = new Store("Loja 2");

        Customer customer = new Customer("Lucas");
        Customer customer2 = new Customer("Maria");
        Customer customer3 = new Customer("Pedro");

        store.eventManager.addObserver(customer);
        store.eventManager.addObserver(customer2);

        // Um mesmo cliente nao pode se inscrever duas vezes
        store.eventManager.addObserver(customer);

        store2.eventManager.addObserver(customer2);
        store2.eventManager.addObserver(customer3);

        // Lojas comprando produtos
        System.out.println("-----------------------------------------------------------");
        store.buyStock();
        store2.buyStock();
        System.out.println("-----------------------------------------------------------");

        // Removendo cliente
        store.eventManager.removeObserver(customer);

        System.out.println("-----------------------------------------------------------");
        store.buyStock();
        store2.buyStock();
        System.out.println("-----------------------------------------------------------");
    }
}
