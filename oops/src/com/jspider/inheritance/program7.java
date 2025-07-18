package com.jspider.inheritance;

class A {
    void test() {
        System.out.println("Executing test()...");
    }
}

class B extends A {
    void disp() {
        System.out.println("Executing disp()...");
    }
}

class C extends A {
    void play() {
        System.out.println("Executing play()...");
    }
}

public class program7 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.test();

        B b1 = new B();
        b1.test();
        b1.disp();

        C c1 = new C();
        c1.test();
        c1.play();
    }
}



