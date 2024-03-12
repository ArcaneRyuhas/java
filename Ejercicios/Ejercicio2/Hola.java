package Ejercicio2;

public class Hola extends Thread{

    @Override
    public void run(){
        while(true){
            System.out.print("Hola");
        }
    }
}
