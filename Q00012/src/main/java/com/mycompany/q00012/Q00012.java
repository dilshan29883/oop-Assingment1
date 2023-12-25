
package com.mycompany.q00012;
import java.util.Scanner;
public class Q00012 {


public class TryCatchFinallyExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int result = 10 / Integer.parseInt(scanner.nextLine());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());

        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }
    }
}

    }
