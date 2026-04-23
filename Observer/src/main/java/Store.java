// Publisher

import java.util.ArrayList;

public class Store {
    public EventManager eventManager = new EventManager();

    private String name;

    private ArrayList<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public void alertAboutProduct() {
        eventManager.notifyObserver("Ha produtos disponiveis na loja " + name);
    }

    public void buyStock() {
        products.add(new Phone("Motorola", 100.0));
        alertAboutProduct();
    }
}
