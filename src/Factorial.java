import java.math.BigInteger;
import java.util.Scanner;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/23/2019
 **/
public class Factorial {

    public static long factorial(long value) {
        if (value == 1 || value == 0)
            return 1;

        return value * factorial(value - 1);
    }

    public static BigInteger factorial2(long value) {
        if (value == 1 || value == 0)
            return BigInteger.ONE/*new BigInteger("1")*/;

        return BigInteger.valueOf(value).multiply(factorial2(value-1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputValue = scanner.nextLong();

        System.out.printf("Factorial of %d is %d%n", inputValue, factorial(inputValue));
        System.out.printf("Factorial2 of %d is %d", inputValue, factorial2(inputValue));
    }
}
