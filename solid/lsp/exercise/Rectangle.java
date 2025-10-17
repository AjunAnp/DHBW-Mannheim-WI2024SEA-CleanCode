package solid.lsp.exercise;

public class Rectangle implements Shape {
    private double width;
    private double height;
    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }
}
