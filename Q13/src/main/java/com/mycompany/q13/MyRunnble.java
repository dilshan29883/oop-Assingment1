
package com.mycompany.q13;

public class MyRunnble implements Runnable {//implemanet the runnable interface sub class

    @Override
    public void run() 
    { 
        int i;
        for(i=0;i<=5;i++){
            //created try & catch
            try{
                Thread.sleep(500);//sleep or waiting time
            }catch(Exception e){
                
            }
            System.out.println(i);
        }
    }  
}
