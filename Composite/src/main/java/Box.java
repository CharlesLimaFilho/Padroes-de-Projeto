// Composite

import java.util.ArrayList;

public class Box implements Component{
    private ArrayList<Component> components = new ArrayList<>();

    @Override
    public double getPrice() {
        double price = 0.5;

        for (Component component : components){
            price += component.getPrice();
        }

        return price;
    }

    public void addComponent(Component component) {
        if (components.contains(component)){
            System.out.println("Componente ja existe");
        } else {
            components.add(component);
        }
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public ArrayList<Component> getComponents() {
        return components;
    }
}
