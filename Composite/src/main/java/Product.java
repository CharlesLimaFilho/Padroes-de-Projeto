// Folha

public class Product implements Component {

    private double price;

    private String name;

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
