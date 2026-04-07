/*
Aqui fica o gerenciador de eventos
Ele é responsável por adicionar, remover e notificar os interessados
Note que ele utiliza o metodo definido pela interface para notificar.
 */

import java.util.ArrayList;

public class EventManager {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addSubscriber(Customer subscriber) {
        if (customers.contains(subscriber)) {
            System.out.println(subscriber.getName() + " ja esta na lista");
        } else {
            customers.add(subscriber);
        }
    }

    public void removeSubscriber(Customer subscriber) {
        customers.remove(subscriber);
        System.out.println(subscriber.getName() + " removido");
    }

    public void notifySubscriber(String context) {
        for (Customer customer : customers) {
            customer.update(context);
        }
    }
}
