package solid.dip.exercise;

public class Robot {

    private final Legs legs;
    private final Hands hands;
    private final PowerSource powerSource;

    public Robot(Legs legs, Hands hands, PowerSource powerSource) {
        this.legs = legs;
        this.hands = hands;
        this.powerSource = powerSource;
    }

    public void goToChargingStation() {
        legs.walk(20);
        legs.turnLeft();
        legs.walk(10);
        hands.grab(powerSource);
        powerSource.charge();
    }
}
