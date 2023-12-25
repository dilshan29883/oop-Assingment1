
package com.mycompany.q012;
import java.util.Scanner;

public class Q012 {

 
        

public class MultipleCatchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division and output the result
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);

        } catch (java.util.InputMismatchException e) {
            // Handle exception if the user enters non-integer input
            System.out.println("Error: Please enter valid integers.");

        } catch (ArithmeticException e) {
            // Handle exception if there is an arithmetic error (e.g., division by zero)
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            // Handle other exceptions that may occur
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // This block will be executed regardless of whether an exception occurs or not
            System.out.println("Finally block executed.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to perform division and throw an exception if the denominator is zero
    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an ArithmeticException with a custom error message
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}

    }
