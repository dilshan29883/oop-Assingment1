
package com.mycompany.q0000012;
import java.io.IOException;

public class Q0000012 {

    // Method declaring that it throws an IOException
    public static void myMethod() throws IOException {
        throw new IOException("IOException in myMethod");
    }

    public static void main(String[] args) {
        try {
            // Call the method that throws an IOException
            myMethod();

        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}

    

