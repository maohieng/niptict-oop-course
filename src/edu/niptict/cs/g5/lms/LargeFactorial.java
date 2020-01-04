package edu.niptict.cs.g5.lms;

import java.math.BigInteger;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/14/2019
 **/
public class LargeFactorial {

    public static BigInteger factorial(long n) {
        if (n == 1 || n == 0) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(50));
        System.out.println(factorial(50L));
    }

}
