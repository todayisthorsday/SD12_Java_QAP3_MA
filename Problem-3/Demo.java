public class Demo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse("Ellipse", 6.0, 4.0);
        shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6.0);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}