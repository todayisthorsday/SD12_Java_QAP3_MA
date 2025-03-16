public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        MoveablePoint moveablePoint = new MoveablePoint(3.0f, 4.0f, 1.0f, 1.0f);

        System.out.println("Inital point: " + point);
        System.out.println("Initial moveable point: " + moveablePoint);

        moveablePoint.move();
        System.out.println("After moving, moveable point: " + moveablePoint);
    }
}