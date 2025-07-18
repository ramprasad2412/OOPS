package com.jspider.METHODOVERIDING;

class A {
    void watchTv() {
        System.out.println("serial/news");
    }
}

class B extends A {
    @Override
    void watchTv() {
        System.out.println("cartoon network / music / sports");
    }
}

public class Mainclass1 {
    public static void main(String[] args) {
        A p = new A();
        p.watchTv(); // Outputs: serial/news

        B  c= new B();
        c.watchTv(); // Outputs: cartoon network / music / sports
    }
}
