package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point point) {
        return sqrt(pow(x - point.x, 2) + pow(y - point.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public double distance3d(Point point) {
        return sqrt(pow(x - point.x, 2) + pow(y - point.y, 2) + pow(z - point.z, 2));
    }

    public void info3d() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        System.out.println(result);
    }

}
