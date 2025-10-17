package solid.dip.exercise;

public class Main {
    public static void main(String[] args) {
        Legs legs = new BasicLegs();
        Hands hands = new BasicHands();
        PowerSource ps = new BasicPowerSource();

        Robot r = new Robot(legs, hands, ps);
        r.goToChargingStation();
    }
}
