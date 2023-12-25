
package com.mycompany.q013;

public class MyThread extends Thread {
    //constructor method
    public MyThread(){
        super();
        start();
    }
    //created the run method (override)
    @Override
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            //created try & catch
            try{
                Thread.sleep(500);//sleep or waiting itme
            }catch(Exception e){
                
            }
            System.out.println(i);
        }
      
        
    }
    
}