package com.ss.fs.basics.two;

import java.util.Objects;

public class Triangle implements  Shape {

    private double area;
    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
        this.calculateArea();
    }

    @Override
    public void calculateArea() {
        this.area = (this.b * this.h) * .5;
    }

    @Override
    public void display() {
        System.out.println("This triangle's area is: "+this.area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.b, b) == 0 && Double.compare(triangle.h, h) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b, h);
    }

}
