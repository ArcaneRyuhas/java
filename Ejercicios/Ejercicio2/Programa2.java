package Ejercicio2;

public class Programa2 {
    
    public static void main(String[] args){
        Hola hola = new Hola();
        Mundo mundo = new Mundo();

        Thread hiloHola = new Thread(hola);
        Thread hiloMundo = new Thread(mundo);

        hiloHola.start();
        hiloMundo.start();
    }
}
