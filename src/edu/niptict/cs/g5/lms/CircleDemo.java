package edu.niptict.cs.g5.lms;


/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/13/2019
 **/
public class CircleDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        printCircle(circle);

        System.out.println("Change data of circle reference.");
        changeCircle(circle);
        printCircle(circle);

        Circle[] circleArray = new Circle[10];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle();
        }
    }

    public static void printCircle(Circle circle) {
        System.out.println("geometry.Circle with radius " + circle.getRadius()
                + " has area " + circle.getArea());
    }

    public static void changeCircle(Circle circle) {
        circle.setRadius(circle.getRadius() + 2);
    }
}
