package solid.dip.exercise;

public class BasicLegs implements Legs {
    public void walk(int steps) {
        System.out.println("Walking " + steps + " steps forward.");
    }
    public void turn(int degree) {
        System.out.println("Turning " + degree + " degrees.");
    }
}
