import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Client client1 = new Client("João", 1);
        Client client2 = new Client("Maria", 2);

        Scanner scanner = new Scanner(System.in);
        int option;

        AccessLogProxy proxy1 = new AccessLogProxy(dataBase);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Conectar cliente");
            System.out.println("2. Desconectar cliente");
            System.out.println("3. Executar query");
            System.out.println("4. Imprimir log de acesso");
            System.out.println("5. Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Lógica para conectar cliente
                    client1.requestAccess(proxy1);
                    client2.requestAccess(proxy1);
                    break;
                case 2:
                    // Lógica para desconectar cliente
                    proxy1.disconnect();
                    break;
                case 3:
                    // Lógica para executar query
                    client1.makeRequest(proxy1, "SELECT * FROM users");
                    break;
                case 4:
                    proxy1.printAccessLog();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
