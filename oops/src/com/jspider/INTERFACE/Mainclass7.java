package com.jspider.INTERFACE;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Shapetoolkit {
    public static void DrawShape(Shape s) {
        if (s != null) {
            s.draw();
        }
    }
}

public class Mainclass7 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        Triangle t = new Triangle();

        // Call DrawShape method with different shapes
        Shapetoolkit.DrawShape(c);
        Shapetoolkit.DrawShape(s);
        Shapetoolkit.DrawShape(t);
    }
}
