package six.oop.design.geometry;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(int x, int y, String color, String name, double width, double height) {
        super(x, y, color, name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
