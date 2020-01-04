package edu.niptict.cs.g5.lms;

import static java.lang.System.out;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/5/2019
 **/
public class Student {

    // Fields

    // Required fields
    private String studentId;
    String name;

    // Optional fields
    protected String gender;
    public int age;

    // Default constructors
//    Student(){
//    }

//    overload constructor
    // no-arg constructor
//    Student() {
//        out.println(age);
//    }

    // Parameterize constructor
    Student(String id, String name) {
        this.studentId = id;
        this.name = name;
    }

    Student(String id, String name, String gender, int age) {
        studentId = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Methods
//    public void setValues(String id, String name, String gender, int age) {
//        studentId = id;
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//    }

    public void display() {
        out.println("Student ID: " + this.studentId);
        out.println("Student name: " + this.name);
        out.println("Student gender: " + this.gender);
        out.print("Student age: " + this.age);
    }

    // Setters

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Getters

    public String getName() {
        return this.name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
