package solid.dip.exercise;

public class BasicPowerSource implements PowerSource {
    public void charge() {
        System.out.println("Charging...");
    }
    public String toString() {
        return "Basic Power Source";
    }
}
