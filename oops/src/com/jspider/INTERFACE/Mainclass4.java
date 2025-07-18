package com.jspider.INTERFACE;

class Bravo {
    void run() {
        System.out.println("Executing run.....");
    }

    interface Echo {
        void send();
    }

    class Foxtrot extends Bravo implements Echo {
        @Override
        public void send() {
            System.out.println("Executing send()...");
        }
    }
}

public class Mainclass4 {
    public static void main(String[] args) {
        // Create object of Bravo to access its inner class Foxtrot
        Bravo bravo = new Bravo();

        // Create object of inner class Foxtrot
        Bravo.Foxtrot fox = bravo.new Foxtrot();

        // Call methods
        fox.run();
        fox.send();
    }
}
