package edu.niptict.cs.g5.lms;

import static java.lang.System.out;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/5/2019
 **/
public class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student("G52019", "Jame", "male", 23);

        student.setStudentId("G52018");
        student.setAge(23);
        student.setName("Jame");
        student.setGender("male");

        out.println("Student name: " + student.getName());
        out.println("Student ID: " + student.getStudentId());

//        student.setValues("G52018", "Jame", "male", 23);

        student.display();

        out.println();

        student = new Student("G520181", "Aime");
        student.display();

        out.println("Initial value of static count is" + StudentStaticField.count);
        StudentStaticField st1 = new StudentStaticField();
        StudentStaticField st2 = new StudentStaticField();
        StudentStaticField st3 = new StudentStaticField();

        out.println("After creating 3 objects, value of count is " + StudentStaticField.count);

        Circle circle1 = new Circle();

        Circle circle2 = new Circle(12.5);
    }

}
