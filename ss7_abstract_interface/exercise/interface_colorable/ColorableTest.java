package ss7_abstract_interface.exercise.interface_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(4);
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        shapes[3] = new Square(4);

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
