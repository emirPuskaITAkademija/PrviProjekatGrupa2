package six.oop.design.geometry;


public abstract class Shape {
    private int x;
    private int y;
    private String color;
    private String name;

    public Shape(int x, int y, String color, String name) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
}
