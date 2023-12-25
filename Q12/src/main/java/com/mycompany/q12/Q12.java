
package com.mycompany.q12;

import java.util.Scanner;

public class Q12 {
    public static void proarray(int asize){
        try{
            if(asize<0){
                throw new IllegalArgumentException("");
            }
            int[] array =new int[asize];
            System.out.println("array of size:"+asize+"create sucessfull");
        }catch(IllegalArgumentException e){
            System.out.println("Error"+e.getMessage());
            
        }
    }

    public static void main(String[] args) 
    {
        Scanner a1=new Scanner(System.in);
        try{
            System.out.print("Enter the size of the array: ");
             int aSize = a1.nextInt();
              proarray(aSize);
        }catch(java.util.InputMismatchException e){
             System.out.println("Error: Please enter a valid integer for array size.");
            
        }
        
    }
}
