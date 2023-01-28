/*
Практическое задание 2.1.13 вычисление радиуса окружности по площади
 */

import com.sun.security.jgss.GSSUtil;

import java.lang.Math;

public class Radius {
    public static void main(String[] args) {
        calcCircleRadius(10);

    }

    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", radius);

    }
}
