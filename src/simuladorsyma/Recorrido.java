package simuladorsyma;


public class Recorrido extends Thread{
  
    @Override
    public void run(){    
        Main.tiempo+=(System.currentTimeMillis()-Main.tiempoInicial)/1000;
    }
}
