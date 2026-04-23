public class Airplane implements Prototype {

    private int id;

    private Motor motor;

    private int numSeats;

    private double seatPrice;

    private String color;

    public Airplane(int id, Motor motor, int numSeats, double seatPrice, String color) {
        this.id = id;
        this.motor = motor;
        this.numSeats = numSeats;
        this.seatPrice = seatPrice;
        this.color = color;
    }

    public Airplane(Airplane target) {
        if (target != null) {
            this.id = IdGenerator.generateID();
            this.motor = (Motor) target.motor.clone();
            this.numSeats = target.numSeats;
            this.seatPrice = target.seatPrice;
            this.color = target.color;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Airplane clone() {
        return new Airplane(this);
    }
}
