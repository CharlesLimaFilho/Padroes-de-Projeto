// Composite

import java.util.ArrayList;

public class Box implements Component{
    private ArrayList<Component> products = new ArrayList<>();

    @Override
    public double getPrice() {
        double price = 0.5;

        for (Component component : products){
            price += component.getPrice();
        }

        return price;
    }

    public void addProduct(Component product) {
        products.add(product);
    }

    public void removeProduct(Component product) {
        products.remove(product);
    }

    public ArrayList<Component> getProducts() {
        return products;
    }
}
