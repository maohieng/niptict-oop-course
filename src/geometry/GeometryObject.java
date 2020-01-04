package geometry;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/30/2019
 **/
public abstract class GeometryObject implements Shape {
    String fillColor;
    String borderColor;
    int borderSize;

    public GeometryObject() {
    }

//    // abstract methods
//    abstract double getSize();

    void display() {
        System.out.println("fillColor: " + fillColor);
        System.out.println("borderColor: " + borderColor);
        System.out.println("borderSize: " + borderSize);
    }
}
