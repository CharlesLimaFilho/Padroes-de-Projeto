public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Açúcar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.2;
    }
    
}
