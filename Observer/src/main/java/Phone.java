public class Phone extends Product {

    private String brand;

    public Phone(String name, double value, String brand) {
        super(name, value);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
