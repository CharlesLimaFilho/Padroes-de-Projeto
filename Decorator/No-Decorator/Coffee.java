public class Coffee {
    private String name;
    private double price;
    private int sugarCont = 0;
    private int milkCont = 0;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSugarContent() {
        return sugarCont;
    }

    public int getMilkContent() {
        return milkCont;
    }

    public void addSugar(int sugar) {
        sugarCont += sugar;
    }

    public void addMilk(int milk) {
        milkCont += milk;
    }

    public void removeSugar(int sugar) {
        if (sugarCont - sugar >= 0) {
            sugarCont -= sugar;
        } else {
            System.out.println("Cannot remove more sugar than present.");
        }
    }

    public void removeMilk(int milk) {
        if (milkCont - milk >= 0) {
            milkCont -= milk;
        } else {
            System.out.println("Cannot remove more milk than present.");
        }
    }
    
}