package solid.dip.exercise;

public interface Legs {
    void walk(int steps);
    void turn(int degree);
    default void turnLeft()  { turn(270); }
    default void turnRight() { turn(90); }
    default void turnAround(){ turn(180); }
}
