package edu.niptict.cs.g5.lms;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/13/2019
 **/
public class TotalArea {

    public static void main(String[] args) {
        // Declare a circle array
        Circle[] circleArray;

        circleArray = createCircleArray();

        printCircleArray(circleArray);
    }

    private static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return circleArray;
    }

    private static void printCircleArray(Circle[] circleArray) {
        final String printFormat = "%-30s%-15s\n";

        System.out.printf(printFormat, "Radius", "Area");

        for (Circle circle : circleArray) {
            System.out.printf(printFormat, circle.getRadius(), circle.getArea());
        }

        System.out.println("---------------------------------------------");

        System.out.printf(printFormat, "Total", sum(circleArray));
    }

    private static double sum(Circle[] circleArray) {
        double sum = 0;

        for (Circle circle : circleArray) {
            sum += circle.getArea();
        }

        return sum;
    }

}
