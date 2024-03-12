package Ejercicio1;

public class Incremento extends Thread{
    
    @Override
    public void run(){
        for (int i = 100; i > 0; i--){
            System.out.println(i);

            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }   
        }
    }

}
