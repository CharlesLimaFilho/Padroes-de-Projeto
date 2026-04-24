// Publisher

import java.util.ArrayList;

public class Store {
    public EventManager eventManager = new EventManager();

    private String name;

    private ArrayList<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public void alertAboutProduct(String context) {
        eventManager.notifyObserver(context);
    }

    public void buyStock() {
        products.add(new Phone("Moto G4", 100.0, "Motorola"));
        alertAboutProduct("O produto " + products.get(products.size() - 1).getName()  + " disponivel na loja " + name);
    }
}
