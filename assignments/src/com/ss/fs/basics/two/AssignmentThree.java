/*
    Create a Shape Interface with the methods "calculateArea" and "display".
    Create a Rectangle, Circle, and Triangle class to implement that interface.
*/

package com.ss.fs.basics.two;

public class AssignmentThree {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.46,5.4);
        Triangle triangle = new Triangle(3.4,10);
        Circle circle = new Circle(2.4);

        rectangle.display();
        triangle.display();
        circle.display();
    }
}
