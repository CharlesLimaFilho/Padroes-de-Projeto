/*
Aqui fica o gerenciador de eventos
Ele é responsável por adicionar, remover e notificar os interessados
Note que ele utiliza o metodo definido pela interface para notificar.
 */

import java.util.ArrayList;

public class EventManager {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        if (observers.contains(observer)) {
            System.out.println("Este observador ja esta na lista");
        } else {
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver(String context) {
        for (Observer observer : observers) {
            observer.update(context);
        }
    }
}
