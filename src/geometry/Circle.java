package geometry;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/16/2019
 **/
public class Circle extends GeometryObject {

    final double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getParimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
