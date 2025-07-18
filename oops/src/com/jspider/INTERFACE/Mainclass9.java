package com.jspider.INTERFACE;

// Shape interface
interface Shape {
    void draw();
}

// Circle class implements Shape
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Square class implements Shape
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Triangle class implements Shape
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

// Shapetoolkit utility class
class Shapetoolkits {
    public static void DrawShape(Shape s) {
        if (s != null) {
            s.draw();
        }
    }
}

// Main class
public class Mainclass9 {
    public static void main(String[] args) {
        // Create a Circle object
        Circle c = new Circle();
        
        // Draw the shape using Shapetoolkit
        Shapetoolkits.DrawShape(c);
    }
}
