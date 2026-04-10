package Airplanes;

import java.util.Objects;

public abstract class Airplane {

    public String motor;

    public int numPassangers;

    public String color;

    public Airplane() {}

    public Airplane(Airplane target) {
        if (target != null) {
            this.motor = target.motor;
            this.numPassangers = target.numPassangers;
            this.color = target.color;
        }
    }

    public abstract Airplane clone();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Airplane)) return false;

        Airplane airplane2 = (Airplane) o;
        return Objects.equals(motor, airplane2.motor)
                && airplane2.numPassangers == numPassangers
                && Objects.equals(color, airplane2.color);
    }
}
