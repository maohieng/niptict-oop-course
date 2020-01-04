package geometry;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/26/2019
 **/
public class ShapeDemo {

    public static void main(String[] args) {
        // Create an array of 4 shapes
        Shape[] shapes = {
                new Circle(2),
                new Triangle(2, 2),
                new Rectangle(2, 2),
                new Square(2)
        };

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];

            System.out.println(shape);
            System.out.println("Perimeter: " + shape.getParimeter());
            System.out.println("Area: " + shape.getArea());
        }
    }
}
