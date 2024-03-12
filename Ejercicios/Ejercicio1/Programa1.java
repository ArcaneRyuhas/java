package Ejercicio1;

public class Programa1 {
    
    public static void main (String [] arg){
        Incremento incremento = new Incremento();
        Decremento decremento = new Decremento();

        Thread primerHilo = new Thread(incremento);
        Thread segundoHilo = new Thread(decremento);

        primerHilo.start();
        segundoHilo.start();
    }
}
