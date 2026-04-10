import Airplanes.CommercialAirplane;

public class Main {
    public static void main(String[] args) {
        CommercialAirplane cAirplane1 = new CommercialAirplane();

        cAirplane1.motor = "Turbofan";
        cAirplane1.numPassangers = 100;
        cAirplane1.color = "red";
        cAirplane1.seatPrice = 10.5;

        CommercialAirplane cAirplane2 = (CommercialAirplane) cAirplane1.clone();
        cAirplane2.color = "blue";

        System.out.println("Airplane 1 color: " + cAirplane1.color);
        System.out.println("Airplane 2 color: " + cAirplane2.color);
    }
}
