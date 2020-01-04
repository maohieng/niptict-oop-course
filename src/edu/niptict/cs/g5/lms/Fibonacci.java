package edu.niptict.cs.g5.lms;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/12/2019
 **/
public class Fibonacci {

    public static double series(int term) {
        if (term == 0) {
            return 0;
        } else if (term == 1) {
            return 1;
        } else {
            return series(term - 1) + series(term - 2);
        }
    }

}
