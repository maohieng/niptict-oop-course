package edu.niptict.cs.g5.lms;

import static java.lang.System.out;

class BlockDemo {

    int nonStatic;

    {
        out.println("Inside non static block");
        nonStatic = 10;
        out.println("Initialize nonStatic value = " + nonStatic);
    }

    static String s1 = "Cambodia";
    static String s2;

    static {
        out.println("Inside static block");
        s2 = s1 + "is my country";
        int i = 10;
        out.println("Exiting static block...");
    }

    public static void main(String[] args) {
        out.println("String s1: " + s1);
        out.println("String s2: " + s2);
        //println("i: " + i);

        BlockDemo block = new BlockDemo();
    }
}
