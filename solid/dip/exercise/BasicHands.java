package solid.dip.exercise;

public class BasicHands implements Hands {
    public void grab(PowerSource powerSource) {
        System.out.println("Grabbing " + powerSource);
    }
}
