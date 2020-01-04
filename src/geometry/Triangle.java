package geometry;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/26/2019
 **/
public class Triangle extends GeometryObject {
    private final double base;
    private final double height;

    private final double epotinous;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.epotinous = Math.sqrt( Math.pow(base, 2) + Math.pow(height, 2) );
    }

    @Override
    public double getParimeter() {
        return base + height + epotinous;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
