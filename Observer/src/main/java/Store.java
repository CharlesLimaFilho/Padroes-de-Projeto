// Publisher

public class Store {
    public EventManager eventManager = new EventManager();

    private String name;

    private int numbers = 10;

    public Store(String name) {
        this.name = name;
    }

    public void decreaseNumbers() {
        if (numbers > 0) {
            eventManager.notifySubscriber("Ha " + numbers + " disponiveis");
            numbers--;
        } else {
            eventManager.notifySubscriber("Esgotados");
        }
    }
}
