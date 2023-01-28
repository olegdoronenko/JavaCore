/*
Реализовать метод, который выведет на экран квадрат максимального значения,
которое может содержаться в переменной long. Чтобы это значение уместилось,
необходимо использовать класс BigInteger
 */

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        maxLongSqr();
    }
    public static void maxLongSqr() {

        BigInteger square = BigInteger.valueOf(Long.MAX_VALUE).pow(2);
        System.out.println(square);
    }


}
