public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Café simples";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
