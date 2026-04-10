package Airplanes;

public class MilitaryAirplane extends Airplane {

    public boolean isDrone;

    public MilitaryAirplane() {}

    public MilitaryAirplane(MilitaryAirplane target) {
        super(target);
        if (target != null) {
            this.isDrone = target.isDrone;
        }
    }

    @Override
    public Airplane clone() {
        return new MilitaryAirplane(this);
    }

    @Override
    public boolean equals(Object airplane) {
        if (!(airplane instanceof MilitaryAirplane) || !super.equals(airplane)) return false;

        MilitaryAirplane other = (MilitaryAirplane) airplane;
        return other.isDrone == this.isDrone;
    }
}
