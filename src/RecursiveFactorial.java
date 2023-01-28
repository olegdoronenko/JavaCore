/*
урок 3.1.8 - факториал БигИнтегер через рекурсию
 */
import java.math.BigInteger;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(24000));
    }

    public static BigInteger factorial(int value) {

        if (value <= 1) {
            return BigInteger.ONE;
        }
            //return BigInteger.valueOf(value).multiply(factorial(value - 1));
        return BigInteger.valueOf(value).multiply(factorial(value - 1));


    }
}
