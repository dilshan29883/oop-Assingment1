
package com.mycompany.q0012;

public class Q0012 {

    public static void main(String[] args) {
         
        try {
            // Uncomment one of the lines below to see the different exceptions in action
            // throw new BaseException("Base Exception");
            throw new SubclassException("Subclass Exception");

        } catch (SubclassException e) {
            System.out.println("Caught SubclassException: " + e.getMessage());

        } catch (BaseException e) {
            System.out.println("Caught BaseException: " + e.getMessage());
        }
    }
}
    

