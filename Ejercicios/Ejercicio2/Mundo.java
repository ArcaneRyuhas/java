package Ejercicio2;

public class Mundo extends Thread{

    @Override
    public void run(){
        while(true){
            System.out.print("Mundo");
        }
    }
}
