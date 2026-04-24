public class Main {
    public static void main(String[] args) {
        Motor airplaneMotor = new Motor("Turbofan");

        Airplane airplane1 = new Airplane(1, airplaneMotor, 100, 15.0, "blue");

        Airplane airplane2 = airplane1.clone();
        System.out.println("Airplane " + airplane1.getId() + ": "
                + airplane1.getMotor().getType() + " - "
                + airplane1.getNumSeats() + " - "
                + airplane1.getSeatPrice() + " - "
                + airplane1.getColor() + "\n");


        airplane2.setColor("orange");
        airplane2.getMotor().setType("Turbofan-2");

        System.out.println("Airplane " + airplane1.getId() + ": "
                + airplane1.getMotor().getType() + " - "
                + airplane1.getNumSeats() + " - "
                + airplane1.getSeatPrice() + " - "
                + airplane1.getColor());
        System.out.println("Airplane " + airplane2.getId() + ": "
                + airplane2.getMotor().getType() + " - "
                + airplane2.getNumSeats() + " - "
                + airplane2.getSeatPrice() + " - "
                + airplane2.getColor());
    }
}
