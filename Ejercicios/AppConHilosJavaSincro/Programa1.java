public class Programa1 {
    private static int hora;


    private static class JuntaThread implements Runnable {
        public JuntaThread(){
            hora = 9;
        }

        @Override
        public void run() {
            realizarJunta();
        }

        public static void realizarJunta(){
            System.out.println(Thread.currentThread().getName() + " junta iniciada a las " + hora);
            hora++;
            System.out.println(Thread.currentThread().getName() + " junta termina a las " + hora);

        }

        public static void main(String[] args) {
            for (int iterator = 0; iterator < 10; iterator++){
                Thread hilo1 = new Thread(new JuntaThread(), "Junta-" + (iterator + 1));
                hilo1.start();
            }
        }
    }
}