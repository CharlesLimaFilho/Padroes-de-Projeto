public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        Product product1 = new Product("Bolo", 15.0);
        Product product2 = new Product("Banana", 12.0);
        Product product3 = new Product("Maca", 12.0);

        box1.addProduct(product1);
        box2.addProduct(product2);
        box2.addProduct(product3);

        box1.addProduct(box2);

        System.out.println(box1.getPrice());
        System.out.println(box2.getPrice());
        System.out.println(box3.getPrice());
    }
}
