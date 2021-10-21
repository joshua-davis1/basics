package com.ss.fs.basics.two;

import java.util.Objects;

public class Rectangle implements  Shape {
    private double area;
    private double l;
    private double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
        this.calculateArea();
    }

    @Override
    public void calculateArea() {
        this.area = this.l * this.w;
    }

    @Override
    public void display() {
        System.out.println("This rectangle's area is: "+this.area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.l, l) == 0 && Double.compare(rectangle.w, w) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(l, w);
    }
}
