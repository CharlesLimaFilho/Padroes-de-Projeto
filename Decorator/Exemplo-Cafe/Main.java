import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + " R$" + coffee.getCost());

        while (true) {
            System.out.println("Escolha uma opção: \n1. Adicionar Leite \n2. Adicionar Açúcar \n3. Remover Decorator \n4. Sair\n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    coffee = new MilkDecorator(coffee);
                    System.out.println(coffee.getDescription() + " R$" + coffee.getCost());
                    break;
                case 2:
                    coffee = new SugarDecorator(coffee);
                    System.out.println(coffee.getDescription() + " R$" + coffee.getCost());
                    break;
                case 3:
                    coffee = ((CoffeeDecorator) coffee).getCoffee();
                    System.out.println(coffee.getDescription() + " R$" + coffee.getCost());
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
