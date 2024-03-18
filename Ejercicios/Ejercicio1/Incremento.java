package Ejercicio1;

public class Incremento extends Thread{
    
    @Override
    public void run(){
        for (int i = 1; i < 101; i++){
            System.out.println(i);

            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }   
        }
    }

}
