package simuladorsyma;


public class Recorrido extends Thread{
  
    @Override
    public void run(){    
        System.out.println("Lavando auto.....\n");
        Main.tiempo+=(System.currentTimeMillis()-Main.tiempoInicial)/1000;
    }
}
