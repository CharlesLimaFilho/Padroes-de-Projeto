package Airplanes;

public class CommercialAirplane extends Airplane {

    public double seatPrice;

    public CommercialAirplane() {}

    public CommercialAirplane(CommercialAirplane target) {
        super(target);
        if (target != null) {
            this.seatPrice = target.seatPrice;
        }
    }

    @Override
    public Airplane clone() {
        return new CommercialAirplane(this);
    }

    @Override
    public boolean equals(Object airplane) {
        if (!(airplane instanceof CommercialAirplane) || !super.equals(airplane)) return false;

        CommercialAirplane other = (CommercialAirplane) airplane;
        return other.seatPrice == this.seatPrice;
    }
}
