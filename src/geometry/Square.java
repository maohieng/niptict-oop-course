package geometry;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/26/2019
 **/
public class Square extends GeometryObject {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getParimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
