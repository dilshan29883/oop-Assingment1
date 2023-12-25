
package com.mycompany.q13;

public class Q13 {

    public static void main(String[] args) 
    {
       MyRunnble m1=new MyRunnble();
       Thread t1=new Thread(m1);
       t1.start();
        int i;
        for(i=0;i<=5;i++){
            //created try & catch
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                
            }
            System.out.println(i);
        }
        
    }
}
