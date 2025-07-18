package com.jspider.Innerclass;

interface Helper {
    void help();
}

public class Mainclass4 {
    public static void main(String[] args) {

        // Anonymous class 1
        Helper h1 = new Helper() {
            @Override
            public void help() {
                System.out.println("Help in house work......");
            }
        };

        // Anonymous class 2
        Helper h2 = new Helper() {
            @Override
            public void help() {
                System.out.println("Help in office work.....");
            }
        };

        // Method calls
        h1.help();
        h2.help();
    }
}
