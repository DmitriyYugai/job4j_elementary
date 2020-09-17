package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt(pow(x2 - x1,2) + pow(y2 - y1,2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is: " + result1);
        double result2 = Point.distance(1, 6, 2, 3);
        System.out.println("result (1, 6) to (2, 3) is: " + result2);
        double result3 = Point.distance(-10, 2, 6, 10);
        System.out.println("result (-10, 2) to (6, 10) is: " + result3);
    }

}
