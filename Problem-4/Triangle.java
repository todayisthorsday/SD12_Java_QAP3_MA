public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (!isValidTriangle(side1, side2, side3)) {
            System.out.println("Invalid triangle. Exiting the program.");
            System.exit(1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
    }
}