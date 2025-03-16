public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Implement abstract methods
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
