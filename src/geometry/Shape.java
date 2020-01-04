package geometry;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/26/2019
 **/
public interface Shape {
    // Constants
    boolean filled = true; // == public static final

    // static method
    static void compare(Shape s1, Shape s2) {
        // ...
    }

    // default method - Java 8+
    default void compare(Shape s) {

    }

    // abstract methods
    double getParimeter();
    double getArea();
}
