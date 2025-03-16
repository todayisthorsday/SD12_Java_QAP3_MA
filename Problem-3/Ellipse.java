public class Ellipse extends Shape {
    private double a; // longest measurement
    private double b; // shortest measurement

    // Constructor
    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }
}