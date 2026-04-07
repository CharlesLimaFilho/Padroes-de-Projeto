// Publisher

public class Store {
    public EventManager eventManager = new EventManager();

    private String name;

    private int produtc1 = 0;

    public Store(String name) {
        this.name = name;
    }

    public void alertAboutProduct() {
        eventManager.notifySubscriber("Ha " + produtc1 + " disponiveis na loja " + name);
    }

    public void buyStock() {
        produtc1 = ((int)(Math.random() * 10) + 1);
    }
}
