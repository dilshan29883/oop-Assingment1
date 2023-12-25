
package com.mycompany.q013;

public class Q013 {

    public static void main(String[] args) {
        MyThread m1=new MyThread();
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
