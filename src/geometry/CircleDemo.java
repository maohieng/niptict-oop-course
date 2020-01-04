package geometry;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/16/2019
 **/
public class CircleDemo {

    public static void main(String[] args) {
//        geometry.Circle circle = new geometry.Circle(); // Create an object with default constructor

        Circle circle2 = new Circle(2.5); // Create an object circle2 with parameter constructor

        System.out.println("Parimeter of circle with radius " + circle2.radius
                + " is " + circle2.getParimeter());

        System.out.println("Area of circle with radius " + circle2.radius
                + " is " + circle2.getArea());
    }

}
