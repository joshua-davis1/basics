package com.ss.fs.basics.two;

import java.util.Objects;

public class Circle implements  Shape {
    private double area;
    private double r;
    private final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
        this.calculateArea();
    }

    @Override
    public void calculateArea() {
        this.area = this.r * this.r * PI;
    }

    @Override
    public void display() {
        System.out.println("This circle's area is: "+this.area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
