package deepcopiesandswallowcopies;


public class program1 {

    // Non-static block
    {
        System.out.println("Non-static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Creating objects, non-static block will be executed for each object created
        program1 p1 = new program1();
        program1 p2 = new program1();
        
        System.out.println("Main method ended");
    }
}

