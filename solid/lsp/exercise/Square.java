package solid.lsp.exercise;

public class Square implements Shape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
